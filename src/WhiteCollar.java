public class WhiteCollar implements Employee{
    private int id;
    private String fio;
    private int birthDate;
    private int exp;
    private int salary;
    private long phone;

    public WhiteCollar(int id, String fio, int birthDate, int exp, int salary, int phone) {
        this.id = id;
        this.fio = fio;
        this.birthDate = birthDate;
        this.exp = exp;
        this.salary = salary;
        this.phone = phone;
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
    public long getPhone(){
        return this.phone;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof WhiteCollar)){
            return false;
        }
        WhiteCollar whiteCollar = (WhiteCollar) obj;
        return (whiteCollar.id == id&&whiteCollar.exp==exp&&whiteCollar.salary==salary&&whiteCollar.fio.equals(fio)&&whiteCollar.phone==(phone));
    }

    @Override
    public String toString() {
        return "Сотрудник " +
                fio + '\'' +
                "ID=" + id +
                ", Дата рождения=" + birthDate +
                ", Опыт работы=" + exp +
                ", Заплата=" + salary +
                ", Телефон=" + phone;
    }
}
