package task2;

public class MVCPatternEmployee {
    public static void main(String[] args) {
        Employee model = new Employee("John Doe", 20.0, 40);
        EmployeeView view = new EmployeeView();
        EmployeeController controller = new EmployeeController(model, view);

        controller.setEmployeeName("Jane Smith");
        controller.setHourlyRate(25.0);
        controller.setHoursWorked(45);

        controller.updateView();
    }

    public static Employee retrieveEmployeeFromDatabase() {
        Employee employee = new Employee("Robert", 20.0, 40);
        return employee;
    }
}
