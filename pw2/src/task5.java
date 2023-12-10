//5. Создать метод, вычисляющую факториал числа с помощью цикла, проверить работу метода.

public class task5
{
    public static long computeFactorial(int n) {
        if (n < 0) return -1;

        long result = 1;
        for (int i = 1; i <= n; i++) result *= i;
        return result;
    }

    public static void main(String[] args) {
        int n = 10;
        long factorial = computeFactorial(n);
        System.out.println("Факториал " + n + "! = " + factorial);
    }
}
