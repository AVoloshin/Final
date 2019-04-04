import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
//        Director director = Department.addEmployee(1,"Иванов Иван Иванович", 101180, 11, 4000, "director@test.by" );
//       Director director1 = Department.addEmployee(2,"Дарт Вейдер Иванович", 111231, 41, 8000, "director1@test.by" );
//       Vice vice = Department.addEmployee(1,"Петров Петр Петрович", 200185, 6, 2000, 291234567, "хороший" );
//       Vice vice1 = Department.addEmployee(2,"Эникен Скайволкерович", 101155, 16, 4000, 441234567, "лучший" );
//       WhiteCollar worker1 = Department.addEmployee(1, "Чижиков ИА", 150396, 3, 1000, 293334455);
//       WhiteCollar worker2 = Department.addEmployee(2, "Пыжиков", 250991, 2, 800, 293214354);
//      WhiteCollar worker3 = Department.addEmployee(3, "Нар Султан", 190798, 1, 500, 291215391);
//      WhiteCollar worker4 = Department.addEmployee(4, "C3PO", 101010, 11, 0, 1111111);
//      WhiteCollar worker5 = Department.addEmployee(4, "C1PO", 101110, 12, 0, 1011011);
//        WhiteCollarList workerList = new WhiteCollarList();
//       WhiteCollarList workerList1 = new WhiteCollarList();
//       workerList.addStaff(worker1);
//       workerList.addStaff(worker2);
//       workerList.addStaff(worker3);
//        workerList1.addStaff(worker4);
//        workerList1.addStaff(worker5);
//       Department dep = new Department(1,"main", "test", director, vice, workerList);
//        Department dep1 = new Department(2,"sub", "star", director1, vice1, workerList1);
//
//        ArrayList<Department> deps = new ArrayList();
//        deps.add(dep);
//        deps.add(dep1);
//        ListLoader json = new ListLoader();
//        String string = json.toJsonArrayList(deps);
//        json.fileWrite(string);
//        ArrayList<Department> departments = json.parseGsonArrayList(string);
//        System.out.println(departments.get(1).getDirector().getFio());
        ListLoader.GetWebList webList = new ListLoader.GetWebList();
        ListLoader.GetLocalList fileList = new ListLoader.GetLocalList();
        webList.run(); fileList.run();
        System.out.println(ListLoader.getLocalList().size());
        System.out.println(ListLoader.getWebList().size());
        System.out.println(ListLoader.getWebList().get(1).toString());
        System.out.println(ListLoader.getLocalList().get(1).toString());
        ListLoader unionList = new ListLoader();
        unionList.unionList();
        ArrayList newList = unionList.unionList();
        System.out.println(newList.size());
        for (int i = 0; i<newList.size();i++){
            newList.get(i).toString();
        }



//    }
//    public static ArrayList load(){
//        ArrayList<Department> localList = null;
//        StringBuilder stringBuilder = new StringBuilder();
//        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("json.txt"))) {
//            String s;
//            while ((s = bufferedReader.readLine()) != null) {
//                stringBuilder.append(s).append("\n");
//            }
//            System.out.println(stringBuilder.toString());
//            Gson gson = new GsonBuilder().setPrettyPrinting().create();
//            localList = gson.fromJson(stringBuilder.toString(), new TypeToken<ArrayList<Department>>(){}.getType());
//            System.out.println("Список из файла загружен");
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//        return localList;
  }
}
