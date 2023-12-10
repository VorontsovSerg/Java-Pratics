package Priceable;

class Car implements Priceable {
    private String name;
    private double price;

    public Car(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }
}