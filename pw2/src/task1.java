//1. Вывести на экран сумму чисел массива с помощью циклов for, while, do while.

public class task1
{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        // Используя цикл for
        int sumFor = 0;
        for (int i = 0; i < numbers.length; i++) {
            sumFor += numbers[i];
        }
        System.out.println("Сумма (for): " + sumFor);

        // Используя цикл while
        int sumWhile = 0;
        int index = 0;
        while (index < numbers.length) {
            sumWhile += numbers[index];
            index++;
        }
        System.out.println("Сумма (while): " + sumWhile);

        // Используя цикл do-while
        int sumDoWhile = 0;
        int i = 0;
        do {
            sumDoWhile += numbers[i];
            i++;
        } while (i < numbers.length);
        System.out.println("Сумма (do-while): " + sumDoWhile);
    }
}
