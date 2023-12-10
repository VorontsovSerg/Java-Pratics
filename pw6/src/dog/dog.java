package dog;

abstract class dog {
    protected String name;
    protected int age;

    dog() {
        name = "Bobik";
        age = 1;
    }

    dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }

    public int getHumanAge() {
        return this.age * 7;
    }

    public String toString() {
        return this.name + ", " + this.age + " years";
    }
}