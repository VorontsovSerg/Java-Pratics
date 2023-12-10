package sliyanie;

import java.util.ArrayList;
import java.util.List;

public class Sorting {
    public static List<Student> mergeSort(List<Student> list1, List<Student> list2) {
        List<Student> mergedList = new ArrayList<>();
        int i = 0, j = 0;

        while (i < list1.size() && j < list2.size()) {
            Student student1 = list1.get(i);
            Student student2 = list2.get(j);

            if (student1.getGPA() >= student2.getGPA()) {
                mergedList.add(student1);
                i++;
            } else {
                mergedList.add(student2);
                j++;
            }
        }

        while (i < list1.size()) {
            mergedList.add(list1.get(i));
            i++;
        }

        while (j < list2.size()) {
            mergedList.add(list2.get(j));
            j++;
        }

        return mergedList;
    }

    public static void main(String[] args) {
        List<Student> list1 = new ArrayList<>();
        list1.add(new Student("Alice", 3.8));
        list1.add(new Student("Bob", 3.5));

        List<Student> list2 = new ArrayList<>();
        list2.add(new Student("Charlie", 4.0));
        list2.add(new Student("David", 3.9));

        System.out.println("Список 1:");
        for (Student student : list1) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }

        System.out.println("\nСписок 2:");
        for (Student student : list2) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }

        List<Student> mergedList = mergeSort(list1, list2);

        System.out.println("\nОтсортированный список:");
        for (Student student : mergedList) {
            System.out.println(student.getName() + " - GPA: " + student.getGPA());
        }
    }
}