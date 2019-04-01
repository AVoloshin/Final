import java.util.ArrayList;

public class Department extends Staff {
    private int id;
    private String name;
    private String spec;
    private Director director;
    private Vice vice;
    private ArrayList<WhiteCollar> staff;

    public Department(int id, String name, String spec, Director director, Vice vice, ArrayList<WhiteCollar> staff) {
        this.id = id;
        this.name = name;
        this.spec = spec;
        this.director = director;
        this.vice = vice;
        this.staff = staff;
    }
    public ArrayList getStaff() {
        return staff;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSpec() {
        return spec;
    }

    public Director getDirector() {
        return director;
    }

    public Vice getVice() {
        return vice;
    }
    static public WhiteCollar addEmployee(int id, String fio, int birthDate, int exp, int salary, int phone) {
        return new WhiteCollar(id, fio, birthDate, exp, salary, phone);
    }
    static public Vice addEmployee(int id, String fio, int birthDate, int exp, int salary, int phone, String rating) {
        return new Vice(id, fio, birthDate, exp, salary, phone, rating);
    }
    static public Director addEmployee(int id, String fio, int birthDate, int exp, int salary, String email) {
        return new Director(id, fio, birthDate, exp, salary, email);
    }
}
