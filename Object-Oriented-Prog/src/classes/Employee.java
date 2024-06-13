package classes;
public class Employee {
    private int baseSalary; // instance member
    private int hourlyRate; // instance member

    public static int numberOfEmployees;

    // we use Constructors to initialize our objects
    // 👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽👇🏽
    public Employee(int baseSalary) {
        this(baseSalary, 0);
    } // constructor overloading
    public Employee(int baseSalary, int hourlyRate) {
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees() {
        System.out.println("Number of Employee: " + numberOfEmployees);
    }
    public int calculateWage(int extraHours) { return baseSalary + (extraHours * getHourlyRate());}

    public int calculateWage() {
        return calculateWage(0);
    } // method overloading

    private int getBaseSalary() {
        return baseSalary;
    }
    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw  new IllegalArgumentException("Salary cannot be 0 or less.");
        this.baseSalary = baseSalary;
    }
    private int getHourlyRate() {
        return hourlyRate;
    }
    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw  new IllegalArgumentException("Hourly rate cannot be 0 or negative.");
        this.hourlyRate = hourlyRate;
    }
}


