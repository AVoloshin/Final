public class Vice implements Employee {
    private int id;
    private String fio;
    private int birthDate;
    private int exp;
    private int salary;
    private int phone;
    private String rating;

    public Vice(int id, String fio, int birthDate, int exp, int salary, int phone, String rating) {
        this.id = id;
        this.fio = fio;
        this.birthDate = birthDate;
        this.exp = exp;
        this.salary = salary;
        this.phone = phone;
        this.rating = rating;
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
    public int getPhone(){
        return this.phone;
    }
    public String getRating(){
        return this.rating;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Vice)){
            return false;
        }
        Vice vice = (Vice) obj;
        return (vice.id == id&&vice.exp==exp&&vice.salary==salary&&vice.fio.equals(fio)&&vice.phone==(phone)&&vice.rating.equals(rating));
    }
    @Override
    public String toString() {
        return "'" + fio + '\'' +
                "ID=" + id +
                ", Дата рождения=" + birthDate +
                ", Опыт работы=" + exp +
                ", Заплата=" + salary +
                ", Телефон=" + phone +
                ", Рейтинг='" + rating +'\'';
    }
}
