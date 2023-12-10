package furniture;

class wardrobe extends furniture {
    protected String contains;

    wardrobe() {
        material = "wood";
        color = "brown";
        contains = "nothing";
    }

    wardrobe(String material, String color) {
        this.material = material;
        this.color = color;
        contains = "nothing";
    }

    wardrobe(String material, String color, String contains) {
        this.material = material;
        this.color = color;
        this.contains = contains;
    }

    public void setContains(String contains) {
        this.contains = contains;
    }
    public String getContains() {
        return contains;
    }

    public String toString() {
        return "Wardrobe contains: " + this.contains;
    }
}