//3. Вывести на экран первые 10 чисел гармонического ряда.

public class task3
{
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");
        for (int i = 1; i <= 10; i++) {
            double harmonic = 1.0 / i;
            System.out.println(harmonic);
        }
    }
}
