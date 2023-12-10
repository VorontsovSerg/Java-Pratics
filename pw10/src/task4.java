public class task4 {
    public static int countNumbersWithSum(int k, int s) {
        if (k == 1) {
            if (s >= 1 && s <= 9) return 1;
            else return 0;
        }

        int count = 0;

        for (int i = 1; i <= 9; i++) {
            if (s - i >= 0) {
                count += countNumbersWithSum(k - 1, s - i);
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int k = 3;
        int s = 5;
        int result = countNumbersWithSum(k, s);
        System.out.println("Количество " + k + "-значных чисел с суммой цифр " + s + ": " + result);
    }
}