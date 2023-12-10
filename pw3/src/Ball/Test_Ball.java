package Ball;

public class Test_Ball
{
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move(45.5, 20);
        System.out.println(b1);
    }
}
