import java.util.Scanner;

public class LabClassUI {
    private LabClass labClass;

    public LabClassUI(LabClass labClass) {
        this.labClass = labClass;
    }

    public void searchStudent() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите ФИО студента для поиска: ");
        String fullName = scanner.nextLine();

        try {
            Student student = labClass.findStudent(fullName);
            System.out.println("Студент найден: " + student.getFullName());
        } catch (StudentNotFoundException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public void addStudent(String fullName) {
        Student newStudent = new Student(fullName);
    }

    public void printAllStudents() {
        labClass.sortStudents();
        Student[] students = labClass.getStudents();

        System.out.println("Список студентов:");
        for (Student student : students) {
            System.out.println(student.getFullName());
        }
    }

    public static void main(String[] args) {
        Student[] students = {
                new Student("Иванов Иван"),
                new Student("Сидоров Сидор"),
                new Student("Петров Петр")
        };
        LabClass labClass = new LabClass(students);
        LabClassUI labClassUI = new LabClassUI(labClass);
        labClassUI.printAllStudents();

        labClassUI.searchStudent();
    }
}
