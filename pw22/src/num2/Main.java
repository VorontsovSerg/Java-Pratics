package num2;

public class Main {
    public static void main(String[] args) {
        ChairFactory chairFactory = new ChairFactory();

        Client client = new Client();
        Chair victorianChair = chairFactory.createChair("Victorian");
        Chair multifunctionalChair = chairFactory.createChair("Multifunctional");
        Chair magicChair = chairFactory.createChair("Magic");

        client.sit(victorianChair);
        client.sit(multifunctionalChair);
        client.sit(magicChair);
    }
}
