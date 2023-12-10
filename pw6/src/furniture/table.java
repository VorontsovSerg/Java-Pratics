package furniture;

class table extends furniture {
    protected String contains;

    table() {
       material = "wood";
       color = "brown";
       contains = "nothing";
    }

    table(String material, String color) {
        this.material = material;
        this.color = color;
        contains = "nothing";
    }

    table(String material, String color, String contains) {
        this.material = material;
        this.color = color;
        this.contains = contains;
    }

    public String get_contained() {
        return this.contains;
    }

    public void set_contained(String contains) {
        this.contains = contains;
    }

    public String toString() {
        return "On table: " + this.contains;
    }
}