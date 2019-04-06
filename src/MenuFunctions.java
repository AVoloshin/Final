import java.util.ArrayList;
import java.util.Scanner;

public class MenuFunctions {

    private  ArrayList<Department> departments;
    private ArrayList<Director> dirs;

    public MenuFunctions(ArrayList<Department> departments) {
        this.departments = departments;
    }

    public void printDepInfo(ArrayList<Department> departments){
        for(Department dep:departments){
            System.out.println(dep.toString());
        }
    }
    public void printDirInfo(ArrayList<Department> departments){
        for(Department dep:departments){
            System.out.println(dep.getDirector().toString());
        }
    }
    public void printViceInfo(ArrayList<Department> departments){
        for(Department dep:departments){
            System.out.println(dep.getVice().toString());
        }
    }
    public void printEmployeeInfo(ArrayList<Department> departments){
        for(Department dep:departments){

            System.out.println(dep.getStaff().getStaffList().toString());
        }
    }
    public void setDirs (){
        ArrayList<Director> dirs = new ArrayList<>();
        for(Department dep:departments){
            dirs.add(dep.getDirector());
        }
        this.dirs=dirs;
    }

    public void mainMenu (){
        Scanner scanner = Menu.getMenuScanner().getScanner();
        MenuFunctions menuFunctions = new MenuFunctions(departments);
        Menu.getMenuScanner().mainMenu();
        do{
            int enter = scanner.nextInt();
            while (enter>5|enter<1){
                System.out.println("Введите цифру от 1 до 5");
                Menu.getMenuScanner().mainMenu();
                enter = scanner.nextInt();
            }
            if(enter!=5) {
                switch (enter) {
                    case 1:
                        menuFunctions.printDepInfo(departments);
                        Menu.getMenuScanner().mainMenu();
                        break;
                    case 2:
                        menuFunctions.printDirInfo(departments);
                        Menu.getMenuScanner().dirMenu();
                        menuFunctions.dirMenu();
                        break;
                    case 3:
                        menuFunctions.printViceInfo(departments);
                        Menu.getMenuScanner().mainMenu();
                        break;
                    case 4:
                        menuFunctions.printEmployeeInfo(departments);
                        Menu.getMenuScanner().mainMenu();
                        break;
                }
            } else break;
        } while (scanner.nextInt()!=5);
    }
    public void dirMenu(){
        Scanner scanner = Menu.getMenuScanner().getScanner();
        MenuFunctions menuFunctions = new MenuFunctions(departments);
        setDirs();
        Menu.getMenuScanner().dirMenu();
        do{
            int enter = scanner.nextInt();
            while (enter>6|enter<1){
                System.out.println("Введите цифру от 1 до 6");
                Menu.getMenuScanner().dirMenu();
                enter = scanner.nextInt();
            }
            if(enter!=6) {
                switch (enter) {
                    case 1:
                        Menu.getMenuScanner().dirSortMenu();
                        menuFunctions.dirSortMenu();
                        break;
                    case 2:
                        createDirector();
                        break;
                    case 3:
                        editDirector();
                        break;
                    case 4:
                        deleteDirector();
                        break;
                    case 5:
                        Menu.getMenuScanner().mainMenu();
                        menuFunctions.mainMenu();
                }
            } else break;
        } while (scanner.nextInt()!=6);
    }

    public void dirSortMenu (){
        Scanner scanner = Menu.getMenuScanner().getScanner();
        MenuFunctions menuFunctions = new MenuFunctions(departments);
        Sort sort = new Sort();
        setDirs();
        Menu.getMenuScanner().dirSortMenu();
        do{
            int enter = scanner.nextInt();
            while (enter>8|enter<1){
                System.out.println("Введите цифру от 1 до 8");
                Menu.getMenuScanner().dirSortMenu();
                enter = scanner.nextInt();
            }
            if(enter!=8) {
                switch (enter) {
                    case 1:
                        sort.sortByDirId(dirs);
                        int count=0;
                        for(Director dir:dirs){
                            System.out.println(count+"."+dir.toString());
                            count++;
                        }
                        Menu.getMenuScanner().dirSortMenu();
                        break;
                    case 2:
                        sort.sortByDirName(dirs);
                        for(Director dir:dirs){
                            System.out.println(dir.toString());
                        }
                        Menu.getMenuScanner().dirSortMenu();
                        break;
                    case 3:
                        sort.sortByDirExp(dirs);
                        for(Director dir:dirs){
                            System.out.println(dir.toString());
                        }
                        Menu.getMenuScanner().dirSortMenu();
                        break;
                    case 4:
                        sort.sortByDirSalary(dirs);
                        for(Director dir:dirs){
                            System.out.println(dir.toString());
                        }
                        Menu.getMenuScanner().dirSortMenu();
                        break;
                    case 5:
                        sort.sortByDirEmail(dirs);
                        for(Director dir:dirs){
                            System.out.println(dir.toString());
                        }
                        Menu.getMenuScanner().dirSortMenu();
                        break;
                    case 6:
                        Menu.getMenuScanner().dirMenu();
                        menuFunctions.dirMenu();
                    case 7:
                        Menu.getMenuScanner().mainMenu();
                        menuFunctions.mainMenu();
                }
            } else break;
        } while (scanner.nextInt()!=8);
    }
    public void deleteDirector(){
        Scanner scanner = Menu.getMenuScanner().getScanner();
        setDirs();
        for(Director dir:dirs){
            System.out.println(dir.toString());
        }
        System.out.println("Введите номер директора для удаления");
        int id = scanner.nextInt();
        for(Director dir: dirs){
            if(dir.getId()==id){
                for(Department dep:departments){
                    if(dep.getDirector().equals(dir)){
                        dep.setDirector(null);
                        System.out.println("В отделе "+dep.getName()+" удален директор "+ dir.getFio());
                    }
                }
            }
        }
    }
    public void createDirector(){
        Scanner scanner = Menu.getMenuScanner().getScanner();

        System.out.println("Введите номер директора для удаления");
    }
    public void editDirector(){
        Scanner scanner = Menu.getMenuScanner().getScanner();

        System.out.println("Введите номер директора для удаления");
    }
}
