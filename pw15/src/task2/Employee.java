package task2;

class Employee {
    protected String name;
    protected double hourlyRate;
    protected int hoursWorked;

    public Employee(String name, double hourlyRate, int hoursWorked) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    public String getName() {
        return name;
    }

    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
