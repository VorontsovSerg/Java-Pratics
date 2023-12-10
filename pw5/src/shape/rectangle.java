package shape;

public class rectangle extends shape
{
    protected double width, length;

    public rectangle(){
        this.filled = false;
        this.color = "blue";
    }
    public rectangle(double width, double length){
        this.filled = false;
        this.color = "blue";
        this.width = width;
        this.length = length;
    }
    public rectangle(double width, double length, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.width = width;
        this.length = length;
    }

    public void setWidth(double width)
    {
        this.width = width;
    }
    public void setLength(double length)
    {
        this.length = length;
    }
    public double getWidth()
    {
        return width;
    }
    public double getLength()
    {
        return length;
    }


    public double getArea()
    {
        return width * length;
    }
    public double getPerimeter()
    {
        return 2 * (width + length);
    }
    public String toString()
    {
        return "Shape: rectangle, width: " + this.width + ", length: " + this.length + ", color: " + this.color;
    }
}
