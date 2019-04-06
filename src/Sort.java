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
    public void  sortByDirName (ArrayList<Director> dirs){
        Collections.sort(dirs, Comparator.comparing(Director::getFio));
    }
    public void  sortByDirId (ArrayList<Director> dirs){
        Collections.sort(dirs, Comparator.comparing(Director::getId));
    }
    public void  sortByDirExp (ArrayList<Director> dirs){
        Collections.sort(dirs, Comparator.comparing(Director::getExp));
    }
    public void  sortByDirEmail (ArrayList<Director> dirs){
        Collections.sort(dirs, Comparator.comparing(Director::getEmail));
    }
    public void  sortByDirSalary (ArrayList<Director> dirs){
        Collections.sort(dirs, Comparator.comparing(Director::getSalary));
    }
}
