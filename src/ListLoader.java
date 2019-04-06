import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class ListLoader {

    private static ArrayList<Department> webList;
    private static ArrayList<Department> localList;
    private static ArrayList<Department> departments;
    private static HashMap<Integer, Department> unionHashMap;

    public static ArrayList<Department> getWebList() {
        return webList;
    }

    public static ArrayList<Department> getLocalList() {
        return localList;
    }

    public static void setDepartments() {
        ListLoader.departments = new ArrayList<>(unionHashMap.values());
    }

    public static ArrayList<Department> getDepartments() {
        return departments;
    }

    public static void createMainList (){
        ListLoader.GetWebList webList = new ListLoader.GetWebList();
        ListLoader.GetLocalList fileList = new ListLoader.GetLocalList();
        webList.run(); fileList.run();
        try {
            webList.join();
            fileList.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ListLoader unionList = new ListLoader();
        unionList.uniteLists();
        ListLoader.setDepartments();
    }

    public void uniteLists (){
        if (getWebList()!=null&&getLocalList()!=null) {
            System.out.println("Объединяем файлы");
            unionHashMap = new HashMap<>();
            for (Department dep : webList) {
                unionHashMap.put(dep.getId(), dep); //Добавляем вебсписок в hashmap
            }
            for (Department dep : localList) { //добавляем локальный список
                if (unionHashMap.containsKey(dep.getId())) { //если есть запись с таким id
                    if (unionHashMap.get(dep.getId()).equals(dep)) { //сравниваем объекты по этому ключу и перезаписываем, если одинаковые
                        unionHashMap.put(dep.getId(), dep);
                    } else System.out.println("Выберите какой объект сохранить");
                    dep.toString();
                    unionHashMap.get(dep.getId()).toString();
                } else unionHashMap.put(dep.getId(), dep); //если id уникальный добавляем запись в hashmap
            }
        }
    }

    public static HashMap getUnionHashMap() {
        return unionHashMap;
    }

    static class GetWebList extends Thread {
        public void run(){
            try {
                URL url = new URL("https://vk.com/doc2026963_496631598");
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection)url.openConnection();
                StringBuilder stringBuilder = new StringBuilder();
                try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream())))
                {
                    String str;
                    while ((str=bufferedReader.readLine())!=null){
                        stringBuilder.append(str);
                    }
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    webList = gson.fromJson(stringBuilder.toString(), new TypeToken<ArrayList<Department>>(){}.getType());
                    System.out.println("Список из веба загружен");
                } catch (IOException e){
                    e.printStackTrace();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    static class GetLocalList extends Thread {
        public void run() {
            StringBuilder stringBuilder = new StringBuilder();
            File f = new File("json1.txt");
            if(!(f.exists()) && !f.isDirectory()) {
                try {
                    throw new MyException("json1.txt");
                } catch (MyException e) {
                    e.printStackTrace();
                }
            }
                try (BufferedReader bufferedReader = new BufferedReader(new FileReader("json1.txt"))) {
                    String s;
                    while ((s = bufferedReader.readLine()) != null) {
                        stringBuilder.append(s).append("\n");
                    }
                    Gson gson = new GsonBuilder().setPrettyPrinting().create();
                    localList = gson.fromJson(stringBuilder.toString(), new TypeToken<ArrayList<Department>>() {
                    }.getType());
                    System.out.println("Список из файла загружен");
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public String toJsonArrayList (ArrayList<Department> deps){
        return new GsonBuilder().setPrettyPrinting().create().toJson(deps);
    }
    public void fileWrite (String string){
        System.out.println(string);
        try {
            FileWriter file = new FileWriter("json1.txt", false);
            file.write(string);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
