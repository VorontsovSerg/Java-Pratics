package bystraya;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortingStudentsByGPA implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        if (student1.getGPA() > student2.getGPA()) {
            return -1;
        } else if (student1.getGPA() < student2.getGPA()) {
            return 1;
        }
        return 0;
    }

    private static int partition(List<Student> students, int low, int high) {
        double pivot = students.get(high).getGPA();
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (students.get(j).getGPA() >= pivot) {
                i++;
                Student temp = students.get(i);
                students.set(i, students.get(j));
                students.set(j, temp);
            }
        }

        Student temp = students.get(i + 1);
        students.set(i + 1, students.get(high));
        students.set(high, temp);

        return i + 1;
    }

    public static void quickSort(List<Student> students, int low, int high) {
        if (low < high) {
            int pi = partition(students, low, high);

            quickSort(students, low, pi - 1);
            quickSort(students, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 3.8));
        students.add(new Student("Bob", 3.5));
        students.add(new Student("Charlie", 4.0));
        students.add(new Student("David", 3.9));

        System.out.println("Список:");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGPA());
        }

        quickSort(students, 0, students.size() - 1);

        System.out.println("\nОтсортированный список(по баллам):");
        for (Student student : students) {
            System.out.println(student.getName() + " " + student.getGPA());
        }
    }
}