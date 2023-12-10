import java.lang.*;
public class TestBall {
    public static void main(String[] args) {
        Ball myBall = new Ball("Красный", 10.0);
        System.out.println(myBall);

        myBall.setColor("Синий");
        myBall.setDiameter(12.5);

        System.out.println("Обновленная информация о мяче:");
        System.out.println(myBall);
    }
}