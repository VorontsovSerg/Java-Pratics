package shape;

public class square extends rectangle
{
    protected double side;
    public square(){
        this.filled = false;
        this.color = "red";
        side = 1.5;
    }
    public square(double side){
        this.filled = false;
        this.color = "red";
        this.side = side;
    }
    public square(double side, String color, boolean filled){
        this.filled = filled;
        this.color = color;
        this.side = side;
    }

    public double getSide()
    {
        return side;
    }
    public void setSide(double side)
    {
        this.side = side;
    }

    public void setWidth(double side)
    {
        this.side = width;
    }
    public void setLength(double side)
    {
        this.side = length;
    }
    public String toString()
    {
        return "Shape: square, side: " + this.side + ", color: " + this.color;
    }
}
