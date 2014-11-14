package prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {
    private List<String> groupOfEmployees;

    public Employees() {
        groupOfEmployees = new ArrayList<String>();
    }

    public Employees(List<String> groupOfEmployees) {
        this.groupOfEmployees = groupOfEmployees;
    }

    public void loadEmployee() {
        groupOfEmployees.add("Timon");
        groupOfEmployees.add("Ace");
        groupOfEmployees.add("Paolo");
        groupOfEmployees.add("Clark");
    }

    public List<String> getGroupOfEmployees() {
        return groupOfEmployees;
    }

    public Employees clone() throws CloneNotSupportedException {
        List<String> tempGroupOfEmployees = new ArrayList<String>();

        for (String employee : this.getGroupOfEmployees()) {
            tempGroupOfEmployees.add(employee);
        }
        return new Employees(tempGroupOfEmployees);
    }
}
