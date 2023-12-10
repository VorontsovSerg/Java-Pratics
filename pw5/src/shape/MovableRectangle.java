package shape;

public class MovableRectangle
{
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x2, y2, xSpeed, ySpeed);
        System.out.println("Rectangle was created");
    }

    public void moveUp() {
        this.topLeft.moveUp();
        this.bottomRight.moveUp();
        System.out.println("Rectangle moved up");
    }

    public void moveDown() {
        this.topLeft.moveDown();
        this.bottomRight.moveDown();
        System.out.println("Rectangle moved down");
    }

    public void moveLeft() {
        this.topLeft.moveLeft();
        this.bottomRight.moveLeft();
        System.out.println("Rectangle moved left");
    }

    public void moveRight() {
        this.topLeft.moveRight();
        this.bottomRight.moveRight();
        System.out.println("Rectangle moved right");
    }

    public String toString() {
        return "Rectangle - topLeft: " + this.topLeft + ", bottomRight: " + this.bottomRight;
    }
}