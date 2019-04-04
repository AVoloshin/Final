import java.util.ArrayList;

public class WhiteCollarList {

    private ArrayList staffList = new ArrayList();

    public WhiteCollarList() {

    }

    public void addStaff(WhiteCollar whiteCollar){
        staffList.add(whiteCollar);
    }
    public ArrayList getStaffList(){
        return staffList;
    }

    @Override
    public boolean equals(Object obj) {
        boolean whiteCollarCompare = true;
        int j=0;
        WhiteCollarList whiteCollars = (WhiteCollarList) obj;
        if(whiteCollars.getStaffList().size()!=staffList.size()){
            return false; //если размеры списков разные, то они не равны
        }
        for(int i=0; i<whiteCollars.staffList.size();i++){ //проверяем количество равных элементов в 2 списках (учитывая что все элементы одного списка разные)
            for(int k=0; k<staffList.size();k++) {
                if (whiteCollars.staffList.get(i).equals(staffList.get(k))) {
                    System.out.println("Элементы равны");
                    j++;
                }
            }
        }
        if(j!=staffList.size()){
            whiteCollarCompare = false;
        }

        return whiteCollarCompare;
    }
}