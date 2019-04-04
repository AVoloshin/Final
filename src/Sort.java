import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Sort  {

    public static void sortId (ArrayList<Department> deps) {
        Collections.sort(deps, Comparator.comparingLong(Department::getId));
    }
    public void  sortByName (ArrayList<Department> deps){
        Collections.sort(deps, Comparator.comparing(Department::getName));
    }

}
