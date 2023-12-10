//4. Сгенерировать массив целых чисел случайным образом, вывести его на экран, отсортировать его, и снова вывести на экран.
import java.util.Arrays;
import java.util.Random;

public class task4
{
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Random random = new Random();

        System.out.println("Исходный массив:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = random.nextInt(100);
            System.out.print(numbers[i] + " ");
        }

        Arrays.sort(numbers);

        System.out.println("\nОтсортированный массив:");
        for (int i = 0; i < numbers.length; i++) System.out.print(numbers[i] + " ");
    }
}
