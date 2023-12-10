package Priceable;

public class main
{
    public static void main(String[] args) {
        Priceable car = new Car(25000.0);

        System.out.println("Car price: " + car.getPrice());
    }
}
