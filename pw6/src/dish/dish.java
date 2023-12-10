package dish;

abstract class dish {
    protected String material;
    protected String color;
    protected String contained;

    dish() {
        this.material = "plastic";
        this.color = "white";
        this.contained = "nothing";
    }

    dish(String material, String color, String contained) {
        this.material = material;
        this.color = color;
        this.contained = contained;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void setContained(String contained) {
        this.contained = contained;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getColor() {
        return color;
    }
    public String getContained() {
        return contained;
    }
    public String getMaterial() {
        return material;
    }

    public String toString() {
        return "dish object: material: " + this.material + ", color: " + this.color + ", contained: " + this.contained;
    }

}