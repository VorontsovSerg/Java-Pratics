package shape;

public class circle extends shape
{
    protected double radius;

    public circle(){
        this.filled = false;
        this.color = "white";
        radius = 1;
    }
    public circle(double radius){
        this.filled = false;
        this.color = "blue";
        this.radius = radius;
    }
    public circle(double radius, String color, boolean filled){
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }

    public double getRadius()
    {
        return radius;
    }
    public void setRadius(double radius)
    {
        this.radius = radius;
    }

    public double getArea()
    {
        return Math.PI*radius*radius;
    }
    public double getPerimeter()
    {
        return 2*Math.PI*radius;
    }
    public String toString()
    {
        return "Shape: circle, radius: " + this.radius + ", color: " + this.color;
    }
}