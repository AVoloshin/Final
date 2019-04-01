public class Director implements Employee {
    private int id;
    private String fio;
    private int birthDate;
    private int exp;
    private int salary;
    private String email;

    public Director(int id, String fio, int birthDate, int exp, int salary, String email) {
        this.id = id;
        this.fio = fio;
        this.birthDate = birthDate;
        this.exp = exp;
        this.salary = salary;
        this.email = email;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public String getFio() {
         return this.fio;
    }
    @Override
    public int getBirthDate() {
        return this.birthDate;
    }

    @Override
    public int getExp() {
        return this.exp;
    }

    @Override
    public int getSalary() {
        return this.salary;
    }
    public String getEmail(){
        return this.email;
    }
}
