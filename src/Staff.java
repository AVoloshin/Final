import com.google.gson.annotations.SerializedName;

import java.beans.Transient;

abstract class Staff {
    @SerializedName("ID")

    transient private int id;
    @SerializedName("ФИО")
    transient private String fio;
    @SerializedName("ДАТА РОЖДЕНИЯ")
    transient private int birthDate;
    @SerializedName("ОПЫТ РАБОТЫ")
    transient private int exp;
    @SerializedName("ЗАРПЛАТА")
    transient private int salary;


    public Staff() {
    }
}
