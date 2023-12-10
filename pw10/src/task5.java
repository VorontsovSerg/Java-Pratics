public class task5 {
    public static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        }

        int lastDigit = n % 10;
        int remainingDigits = n / 10;
        return lastDigit + sumOfDigits(remainingDigits);
    }

    public static void main(String[] args) {
        int N = 12345;
        int result = sumOfDigits(N);
        System.out.println("Сумма цифр числа " + N + " равна " + result);
    }
}