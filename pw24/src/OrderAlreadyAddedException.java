public class OrderAlreadyAddedException extends Exception {
    public OrderAlreadyAddedException(int num) {
        super("Стол " + num + " занят.");
    }
}