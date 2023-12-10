import java.util.HashMap;
import java.util.Map;

public class OrderManager {
    private Map<Integer, Order> orders;

    public OrderManager() {
        this.orders = new HashMap<>();
    }

    public void add(Order order, int tableNumber) throws OrderAlreadyAddedException
    {
        if (orders.containsKey(tableNumber))
        {
            throw new OrderAlreadyAddedException(tableNumber);
        }
        orders.put(tableNumber, order);
    }

    public Order getOrder(int tableNumber) {
        return orders.get(tableNumber);
    }

    public void addDish(Dish dish, int tableNumber) {
        Order order = orders.get(tableNumber);
        if (order != null) {
            order.addItem(dish);
        }
    }

    public void removeOrder(int tableNumber) {
        orders.remove(tableNumber);
    }

    public int freeTableNumbers() {
        int count = 0;
        for (int i = 1; i <= 10; i++) {
            if (!orders.containsKey(i)) {
                count++;
            }
        }
        return count;
    }

    public int[] freeTableNumbersArray() {
        int[] freeTables = new int[freeTableNumbers()];
        int index = 0;
        for (int i = 1; i <= 10; i++) {
            if (!orders.containsKey(i)) {
                freeTables[index] = i;
                index++;
            }
        }
        return freeTables;
    }

    public Order[] getOrders() {
        return orders.values().toArray(new Order[0]);
    }

    public double ordersCostSummary() {
        double sum = 0;
        for (Order order : orders.values()) {
            sum += order.costTotal();
        }
        return sum;
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (Order order : orders.values()) {
            count += order.itemQuantity(dishName);
        }
        return count;
    }
}
