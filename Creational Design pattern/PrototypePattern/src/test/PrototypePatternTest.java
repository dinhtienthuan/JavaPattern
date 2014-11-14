package test;

import java.util.List;

import prototype.Employees;

public class PrototypePatternTest {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees employees = new Employees();
        employees.loadEmployee();

        Employees newEmployees = employees.clone();
        Employees newEmployees1 = employees.clone();

        List<String> groupOfEmployees = newEmployees.getGroupOfEmployees();
        groupOfEmployees.add("Hammer");
        List<String> groupOfEmployees1 = newEmployees1.getGroupOfEmployees();
        groupOfEmployees1.remove("Timon");

        System.out.println("Employees: " + employees.getGroupOfEmployees());
        System.out.println("New Employees: " + groupOfEmployees);
        System.out.println("New Employees 1: " + groupOfEmployees1);
    }
}
