package dish;

class plate extends dish {
    protected double radius;

    plate() {
        color = "Blue";
        material = "porcelain";
        radius = 1;
    }

    plate(double radius) {
        color = "Blue";
        material = "porcelain";
        this.radius = radius;
    }

    plate(double radius, String color, String material, String contained) {
        this.color = color;
        this.material = material;
        this.contained = contained;
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public String toString()
    {
        return "dish: plate, radius: " + this.radius;
    }
}