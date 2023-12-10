package furniture;

abstract class furniture {
    protected String material;
    protected String color;

    furniture() {
        this.material = "unsetted";
        this.color = "unsetted";
    }
    furniture(String material, String color) {
        this.material = material;
        this.color = color;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getMaterial() {
        return material;
    }
    public String getColor() {
        return color;
    }

    public String toString() {
        return "furniture object: material: " + this.material + ", color: " + this.color;
    }
}