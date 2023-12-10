package task2;

class EmployeeController {
    private Employee model;
    private EmployeeView view;

    public EmployeeController(Employee model, EmployeeView view) {
        this.model = model;
        this.view = view;
    }

    public void setEmployeeName(String name) {
        model = new Employee(name, model.hourlyRate, model.hoursWorked);
    }

    public void setHourlyRate(double hourlyRate) {
        model = new Employee(model.name, hourlyRate, model.hoursWorked);
    }

    public void setHoursWorked(int hoursWorked) {
        model = new Employee(model.name, model.hourlyRate, hoursWorked);
    }

    public void updateView() {
        view.printEmployeeDetails(model.getName(), model.calculateSalary());
    }
}