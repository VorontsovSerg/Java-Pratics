package Circle;

public class Circle
{
    private double r = 0.0;

    public Circle(){};
    public Circle(double r)
    {
        this.r = r;
    };
    public void setRadius(double r)
    {
        this.r = r;
    };
    public double getRadius()
    {
        return r;
    };
    public String toString() {
        return "Circle radius = " + r;
    }
}
