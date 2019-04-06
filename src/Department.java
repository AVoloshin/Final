
public class Department {
    private int id;
    private String name;
    private String spec;
    private Director director;
    private Vice vice;
    private WhiteCollarList staff;

    public Department(int id, String name, String spec, Director director, Vice vice, WhiteCollarList staff) {
        this.id = id;
        this.name = name;
        this.spec = spec;
        this.director = director;
        this.vice = vice;
        this.staff = staff;
    }
    public WhiteCollarList getStaff() {
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

    public void setDirector(Director director) {
        this.director = director;
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

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Отдел"+" ID=" + id +", название: '" + name + '\'' +", назначение: '" + spec + '\'' +'\n'+"директор: " + director.toString() +'\n'+"заместитель: " + vice.toString() +'\n'+"штат: ");
        for(int i=0; i<staff.getStaffList().size();i++){
            stringBuilder.append(staff.getStaffList().get(i).toString()+'\n');
        }
        return stringBuilder.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Department)){
            return false;
        }
        Department dep = (Department) obj;

        return (dep.getName().equals(getName())&&dep.getSpec().equals(getSpec())&&dep.getDirector().equals(getDirector())&&dep.getVice().equals(getVice())&&dep.getStaff().equals(getStaff()));
    }
}
