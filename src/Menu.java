import java.util.Scanner;

public class Menu {
    private static Menu menu;
    private MenuFunctions menuFun;
    public Menu() {
    }

    public static Menu getMenuScanner() {
        if(menu==null){
            menu = new Menu();
        }
        return menu;
    }

    private Scanner scanner = new Scanner(System.in);

    public Scanner getScanner() {
        return scanner;
    }

    public void mainMenu(){
        System.out.println('\n');
        System.out.println("Меню находится в разработке, полностью работает пункт 2");
        System.out.println("1. Вывести информацию по всем отделам: ");
        System.out.println("2. Вывести информацию по всем директорам: ");
        System.out.println("3. Вывести информацию по всем замам: ");
        System.out.println("4. Вывести информацию по всем сотрудникам: ");
        System.out.println("5. Выйти из программы ");
        System.out.println("Введите ваш выбор: ");
    }
    public void dirMenu(){
        System.out.println('\n');
        System.out.println("Меню находится в разработке, работают пункт 1, 4, 5, 6");
        System.out.println("1. Вывести отссоритированный список директоров ");
        System.out.println("2. Создать запись ");
        System.out.println("3. Редактировать запись ");
        System.out.println("4. Удалить запись ");
        System.out.println("5. Вернуться на главную ");
        System.out.println("6. Выйти из программы ");
        System.out.println("Введите ваш выбор: ");
    }
    public void dirSortMenu(){
        System.out.println('\n');
        System.out.println("1. Сортировать по ID ");
        System.out.println("2. Сортировать по ФИО ");
        System.out.println("3. Сортировать по стажу ");
        System.out.println("4. Сортировать по зарплате ");
        System.out.println("5. Сортировать по email ");
        System.out.println("6. Вернуться в меню директоров ");
        System.out.println("7. Вернуться на главную ");
        System.out.println("8. Выйти из программы ");
        System.out.println("Введите ваш выбор: ");
    }
}
