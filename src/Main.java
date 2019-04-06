import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ListLoader.createMainList();
       MenuFunctions menu = new MenuFunctions(ListLoader.getDepartments());
       menu.mainMenu();
//        ArrayList unAr = new ArrayList();
//        for (Object dep: uList.values()){
//            System.out.println(dep.toString());
//            unAr.add(dep);
//        }
//        GenerateXML gen = new GenerateXML();
//        gen.generateXML(uList);
//        Object employee = ListLoader.getWebList().get(0).getStaff().getStaffList().get(0);
//        System.out.println(employee.toString());

//     String json = unionList.toJsonArrayList(unAr);
//       System.out.println(json);

























//        WhiteCollar whiteCollar1 = Department.addEmployee(22,"Иванов АА", 210976, 13,1100,444134455);
//        WhiteCollar whiteCollar2 = Department.addEmployee(23,"Пыжиков", 250991, 2,800,297233952);
//        WhiteCollar whiteCollar3 = Department.addEmployee(24,"Нар Султан", 190798, 1,500,297234992);
//        WhiteCollar whiteCollar4 = Department.addEmployee(101,"R2D2", 010101, 110,0,1010101);
//        WhiteCollar whiteCollar5 = Department.addEmployee(110,"C3PO", 101010, 101,0,1111111);
//        WhiteCollar whiteCollar6 = Department.addEmployee(222,"Вуки", 6051970, 50,1000,3333333);
//        WhiteCollar whiteCollar7 = Department.addEmployee(223,"Хан Соло", 7051970, 50,2000,3433333);
//        Director director = Department.addEmployee(1,"Иванов Иван Иванович", 101180, 11,4000, "director@test.by");
//        Director director1 = Department.addEmployee(1,"Вейдер", 4051970, 59,999999, "darthvader666@starwars.com");
//        Vice vice =  Department.addEmployee(1,"Петров Петр Петрович", 200185, 6,2000, 291234567, "средний");
//        Vice vice1 =  Department.addEmployee(22,"Люк Скайуокер", 5051970, 59,555555, 441234567, "джедай");
//        WhiteCollarList whiteCollarList = new WhiteCollarList();
//        WhiteCollarList whiteCollarList1 = new WhiteCollarList();
//        whiteCollarList.addStaff(whiteCollar1);
//        whiteCollarList.addStaff(whiteCollar2);
//        whiteCollarList.addStaff(whiteCollar3);
//        whiteCollarList1.addStaff(whiteCollar4);
//        whiteCollarList1.addStaff(whiteCollar5);
//        whiteCollarList1.addStaff(whiteCollar6);
//        whiteCollarList1.addStaff(whiteCollar7);
//        Department department = new Department(1, "Тестовый", "Тестирование", director,vice,whiteCollarList);
//        Department department1 = new Department(2, "Звездные войны", "Галактика", director1,vice1,whiteCollarList1);
//        ArrayList<Department> deps = new ArrayList<>();
//        deps.add(department);
//        deps.add(department1);
//        String json1 = unionList.toJsonArrayList(deps);
//        System.out.println(json1);
//        unionList.fileWrite(json1);
//        ListLoader.GetLocalList fileList = new ListLoader.GetLocalList();
//        fileList.run();
//        System.out.println(ListLoader.getLocalList().get(0).getStaff().getStaffList());
//        System.out.println(ListLoader.getLocalList().get(0).getStaff().getFio(1));





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
