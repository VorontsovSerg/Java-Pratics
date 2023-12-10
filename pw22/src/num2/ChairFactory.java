package num2;

class ChairFactory {
    Chair createChair(String type) {
        switch (type.toLowerCase()) {
            case "victorian":
                return new VictorianChair();
            case "multifunctional":
                return new MultifunctionalChair();
            case "magic":
                return new MagicChair();
            default:
                throw new IllegalArgumentException("Unknown chair type");
        }
    }
}
