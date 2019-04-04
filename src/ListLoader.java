import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.net.ssl.HttpsURLConnection;
import java.io.*;
import java.net.URL;
import java.util.ArrayList;

public class ListLoader {

    private static ArrayList<Department> webList;
    private static ArrayList<Department> localList;
    private static ArrayList<Department> unionList;

    public ArrayList<Department> unionList(){
        unionList.addAll(webList); //добавляем в общий список список из веба
        for(Department dep: localList){ //добавляем в общий список список локальный сравнивая ID записей двух списков
            for(int i=0; i<webList.size(); i++){
                if(dep.getId()==webList.get(i).getId()){

                }
            }
        }
        return unionList;
    }

    class getWebList extends Thread {
        public void run(){
            try {
                URL url = new URL("https://vk.com/doc2026963_496287439");
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
    class getLocalList extends Thread {
        public void run(){
            StringBuilder stringBuilder = new StringBuilder();
            try (BufferedReader bufferedReader = new BufferedReader(new FileReader("json.txt"))) {
                String s;
                while ((s = bufferedReader.readLine()) != null) {
                    stringBuilder.append(s).append("\n");
                }
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                localList = gson.fromJson(stringBuilder.toString(), new TypeToken<ArrayList<Department>>(){}.getType());
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
            FileWriter file = new FileWriter("json.txt", false);
            file.write(string);
            file.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
