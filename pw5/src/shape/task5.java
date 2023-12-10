package shape;

public class task5
{
    public static void main(String[] args)
    {
        MovableRectangle r = new MovableRectangle(1, 2, 4, 5, 10, 11);
        System.out.println(r);
        r.moveUp();
        r.moveLeft();
        r.moveDown();
        System.out.println(r);
    }
}
