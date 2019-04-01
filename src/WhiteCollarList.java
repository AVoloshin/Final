import java.util.ArrayList;

public class WhiteCollarList {

    private ArrayList<WhiteCollar> staffList = new ArrayList<>();

    public WhiteCollarList() {

    }

    public void addStaff(WhiteCollar whiteCollar){
        staffList.add(whiteCollar);
    }
    public ArrayList<WhiteCollar> getStaffList(){
        return staffList;
    }
}