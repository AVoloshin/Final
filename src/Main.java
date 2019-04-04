import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Director director = Department.addEmployee(1,"Иванов Иван Иванович", 101180, 11, 4000, "director@test.by" );
        Director director1 = Department.addEmployee(1,"Иванов Иван Иванович", 101180, 10, 4000, "director@test.by" );
        System.out.println(director.equals(director1));
//        Director director1 = Department.addEmployee(2,"Дарт Вейдер Иванович", 111231, 41, 8000, "director1@test.by" );
       Vice vice = Department.addEmployee(1,"Петров Петр Петрович", 200185, 6, 2000, 291234567, "хороший" );
        Vice vice1 = Department.addEmployee(2,"Эникен Скайволкерович", 101155, 16, 4000, 441234567, "лучший" );
       WhiteCollar worker1 = Department.addEmployee(1, "Чижиков ИА", 150396, 3, 1000, 293334455);
       WhiteCollar worker5 = Department.addEmployee(1, "Чижиков ИА", 150396, 3, 1000, 293334455);
       WhiteCollar worker2 = Department.addEmployee(2, "Пыжиков", 250991, 2, 800, 293214354);
      WhiteCollar worker3 = Department.addEmployee(3, "Нар Султан", 190798, 1, 500, 291215391);
//        WhiteCollar worker4 = Department.addEmployee(4, "C3PO", 101010, 11, 0, 1111111);
        WhiteCollarList workerList = new WhiteCollarList();
       WhiteCollarList workerList1 = new WhiteCollarList();
       workerList.addStaff(worker1);
       workerList.addStaff(worker2);
       workerList.addStaff(worker1);
        workerList1.addStaff(worker1);
        workerList1.addStaff(worker1);
        workerList1.addStaff(worker2);

        System.out.println(workerList.equals(workerList1));
       Department dep = new Department(1,"main", "test", director, vice, workerList);
        Department dep1 = new Department(2,"sub", "star", director1, vice1, workerList1);
        Department dep3 = new Department(2,"sub", "star", director1, vice1, workerList);
        System.out.println(dep3.equals(dep1));
        System.out.println(dep.toString());
//        ArrayList<Department> deps = new ArrayList();
//        deps.add(dep);
//        deps.add(dep1);
//        String string = json.toJsonArrayList(deps);
//        json.fileWrite(string);
//        ArrayList<Department> departments = json.parseGsonArrayList(string);
//        System.out.println(departments.get(1).getDirector().getFio());

    }
}
