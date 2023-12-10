package shape;

public abstract class shape
{
    protected String color;
    protected boolean filled;

    public shape()
    {
        this.color = "white";
        this.filled = false;
    }
    public shape(String color, boolean filled)
    {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    public boolean isFilled() {
        return filled;
    }

    public double getArea()
    {
        return 0;
    }
    public double getPerimeter()
    {
        return 0;
    }
    public String toString()
    {
        return "Shape color: " + this.color;
    }
}