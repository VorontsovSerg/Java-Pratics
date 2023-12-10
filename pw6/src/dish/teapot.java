package dish;

public class teapot extends dish {

    teapot()
    {
        color = "red";
        material = "porcelain";
        contained = "tea";
    }

    teapot(String color, String material, String contains) {
        this.color = color;
        this.material = material;
        this.contained = contains;
    }

    void pour() {
        System.out.println("Teapot poured one cup of " + this.contained);
    }

    void pour_out() {
        System.out.println("Teapot poured out all " + this.contained);
        contained = "nothing";
    }

    // Radius getter

    public String toString() {
        return "Teapot: material: " + this.material + ", contains " + contained;
    }
}
