package vstavki;

public class StudentSorter {
    public static void insertionSort(Student[] students) {
        int n = students.length;
        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber() > key.getIDNumber()) {
                students[j + 1] = students[j];
                j--;
            }
            students[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        Student[] IDnumber = {
                new Student(3, "Alice"),
                new Student(1, "Bob"),
                new Student(2, "Charlie")
        };

        System.out.println("Неотсортированный список:");
        for (int i = 0; i < IDnumber.length; i++) {
            Student student = IDnumber[i];
            System.out.println(student.getName() + " - ID: " + student.getIDNumber());
        }

        insertionSort(IDnumber);

        System.out.println("\nОтстортированный по ID:");
        for (Student student : IDnumber) {
            System.out.println(student.getName() + " - ID: " + student.getIDNumber());
        }
    }
}