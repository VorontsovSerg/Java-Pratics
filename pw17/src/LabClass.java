import java.util.Arrays;

public class LabClass {
    private Student[] students;

    public LabClass(Student[] students) {
        this.students = students;
    }

    public void sortStudents() {
        quickSort(students, 0, students.length - 1);
    }

    private void quickSort(Student[] arr, int low, int high) {
        if (low < high) {
            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }

    private int partition(Student[] arr, int low, int high) {
        String pivot = arr[high].getFullName();
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j].getFullName().compareToIgnoreCase(pivot) < 0) {
                i++;

                Student temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        Student temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public Student findStudent(String fullName) throws StudentNotFoundException {
        for (Student student : students) {
            if (student.getFullName().equalsIgnoreCase(fullName)) {
                return student;
            }
        }
        throw new StudentNotFoundException("Студент не найден: " + fullName);
    }

    public Student[] getStudents() {
        return students;
    }
}