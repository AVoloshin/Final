public class Main {

    public static void main(String[] args) {

        ListLoader.createMainList();
       MenuFunctions menu = new MenuFunctions(ListLoader.getDepartments());
       menu.mainMenu();
    }
}
