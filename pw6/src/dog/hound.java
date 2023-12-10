package dog;

class hound extends dog {

    hound() {
        name = "unsetted";
        age = 1;
    }

    hound(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void hunt() {
        System.out.println("Hound now hunting");
    }

    void persecute() {
        System.out.println("Hound now persecuting someone");
    }

    public String toString() {
        return "Hound " + this.name + ", " + this.age + " years";
    }
}