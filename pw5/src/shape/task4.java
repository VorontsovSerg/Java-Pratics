package shape;

public class task4
{
    public static void main(String[] args)
    {
        MovablePoint p1 = new MovablePoint(1, 3, 4, 5);
        System.out.println("1)" + p1 + "\n");
        p1.moveDown();
        p1.moveRight();
        System.out.println(p1 + "\n");

        MovableCircle c = new MovableCircle(5, 4, 3, 5, 6);
        System.out.println("2)" + c + "\n");
        c.moveDown();
        c.moveLeft();
        c.moveUp();
        c.moveRight();
        System.out.println("\n" + c);
    }
}
