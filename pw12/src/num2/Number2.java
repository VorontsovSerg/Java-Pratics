package num2;

import java.util.ArrayDeque;
import java.util.Queue;

public class Number2 {
    Queue<Integer> fp, sp;

    public Number2(String fp, String sp) {
        this.fp = new ArrayDeque<>();
        this.sp = new ArrayDeque<>();
        for (int i = 0; i < 5; i++) {
            this.fp.add(Integer.parseInt(fp.substring(i, i + 1)));
            this.sp.add(Integer.parseInt(sp.substring(i, i + 1)));
        }
    }

    public String play() {
        int count = 0;
        while (!fp.isEmpty() && !sp.isEmpty() && count < 106) {
            if (fp.peek() > sp.peek() && sp.peek() != 0) {
                fp.add(fp.poll());
                fp.add(sp.poll());
            } else {
                sp.add(fp.poll());
                sp.add(sp.poll());
            }
            count++;
        }
        String res = "";
        if (fp.isEmpty()) res += "Второй игрок ";
        else res += "Первый игрок ";
        res += count + " ходов";
        if (count >= 106) res += ", botva";
        return res;
    }

    public static void main(String[] args) {
        System.out.println("Пусть у первого игрока: 1 3 5 7 9\nУ второго: 2 4 6 8 0\nПобедитель: ");
        System.out.println(new Number2("13579", "24680").play());
        System.out.println("\nПусть у первого игрока: 6 7 8 9 0\nУ второго: 1 3 0 2 9\nПобедитель: ");
        System.out.println(new Number2("67890", "13029").play());
    }
}
