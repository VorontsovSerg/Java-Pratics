public class Ball {
    private String color;
    private double diameter;

    public Ball(String color, double diameter) {
        this.color = color;
        this.diameter = diameter;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Ball: [Color: " + color + ", Diameter: " + diameter + " cm]";
    }
}
