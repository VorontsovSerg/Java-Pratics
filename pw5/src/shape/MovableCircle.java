package shape;

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        this.center = new MovablePoint(x, y, xSpeed, ySpeed);
        if (radius > 0) this.radius = radius;
        else this.radius = 1;
    }

    public String toString() {
        return "Circle - radius: " + this.radius + ", center: " + center;
    }

    public void moveUp() {
        this.center.moveUp();
        System.out.println("Circle moved up");
    }

    public void moveDown() {
        this.center.moveDown();
        System.out.println("Circle moved down");
    }

    public void moveLeft() {
        this.center.moveLeft();
        System.out.println("Circle moved left");
    }

    public void moveRight() {
        this.center.moveRight();
        System.out.println("Circle moved right");
    }
}