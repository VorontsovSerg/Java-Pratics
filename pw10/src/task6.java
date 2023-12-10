public class task6 {
    public static boolean isPrime(int n) {
        return isPrime(n, 2);
    }

    private static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        if (divisor * divisor > n) {
            return true;
        }
        return isPrime(n, divisor + 1);
    }

    public static void main(String[] args) {
        int n = 17;
        System.out.println(n + " is Prime: ");
        if (isPrime(n)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}