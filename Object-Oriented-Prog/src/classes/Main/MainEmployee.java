package classes.Main;

import classes.Employee;

public class MainEmployee {
    // we use "static" only when we really want to call a method from the main method.
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();

        int wage = employee.calculateWage(0);
        System.out.println("Wage: " + wage);
    }
}
