import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Main {

    public static void main(String[] args) {
        Director director = Department.addEmployee(1,"Иванов Иван Иванович", 101180, 11, 4000, "director@test.by" );
        Vice vice = Department.addEmployee(1,"Петров Петр Петрович", 200185, 6, 2000, 291234567, "хороший" );
        WhiteCollar worker1 = Department.addEmployee(1, "Чижиков ИА", 150396, 3, 1000, 293334455);
        WhiteCollar worker2 = Department.addEmployee(2, "Пыжиков", 250991, 2, 800, 293214354);
        WhiteCollar worker3 = Department.addEmployee(3, "Нар Султан", 190798, 1, 500, 291215391);
        WhiteCollarList workerList = new WhiteCollarList();
        workerList.addStaff(worker1);
        workerList.addStaff(worker2);
        workerList.addStaff(worker3);
        Department dep = new Department(1,"main", "test", director, vice, workerList.getStaffList());
        System.out.println(dep.getDirector().getFio());
    }
}
