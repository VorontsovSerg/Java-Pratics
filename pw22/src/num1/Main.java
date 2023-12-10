package num1;

public class Main {
    public static void main(String[] args) {
        ConcreteFactory factory = new ConcreteFactory();
        Complex complex1 = factory.createComplex();
        Complex complex2 = factory.createComplex(5, 3);

        System.out.println("Complex 1: " + complex1);
        System.out.println("Complex 2: " + complex2);

        System.out.println("Real part of Complex 2: " + complex2.getReal());
        System.out.println("Image part of Complex 2: " + complex2.getImage());
        complex2.setReal(10);
        complex2.setImage(7);
        System.out.println("Modified Complex 2: " + complex2);
    }
}
