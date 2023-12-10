public class Main {
    public static void main(String[] args) {
        // Тестирование OrderManager + исключений
        OrderManager orderManager = new OrderManager();
        System.out.println("-----------------------------------------");
        System.out.println("Проверка первого исключения (OrderAlreadyAddedException) на то, что столик уже занят");
        System.out.println("Добавим заказ на столик");

        try {
            // Пытаемся добавить заказ на столик
            Order order1 = new RestaurantOrder();
            orderManager.add(order1, 1);
            System.out.println("Заказ успешно добавлен на столик 1.");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Попытка добавить заказ на уже занятый столик
            Order order2 = new RestaurantOrder();
            orderManager.add(order2, 1);
            System.out.println("Заказ успешно добавлен на столик 1.");
        } catch (OrderAlreadyAddedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("-----------------------------------------");

        System.out.println("Проверка второго исключения (IllegalTableNumber)");
        System.out.println("Получение заказа по несуществующему номеру столика: ");

        try {
            Order retrievedOrder = orderManager.getOrder(2);
            if (retrievedOrder != null) {
                System.out.println("Полученный заказ: " + retrievedOrder.toString());
            }
        } catch (IllegalTableNumber e) {
            System.out.println(e.getMessage());
        }

        System.out.println("-----------------------------------------");
        System.out.println("Тестирование InternetOrder");

        Item item1 = new Dish(200, "Пицца", "Вкусная");
        Item item2 = new Dish(100, "Суп", "Горячий и ароматный");
        Item[] items = {item1, item2};
        InternetOrder internetOrder = new InternetOrder(items);

        System.out.println("Цена интернет-заказа: " + internetOrder.costTotal());
        System.out.println("Число элементов заказа: " + internetOrder.itemsQuantity());
        System.out.println("-----------------------------------------");
        System.out.println("Тестирование RestaurantOrder:");

        RestaurantOrder restaurantOrder = new RestaurantOrder();
        restaurantOrder.addItem(item1);
        restaurantOrder.addItem(item2);
        System.out.println("Цена заказа: " + restaurantOrder.costTotal());
        System.out.println("Количество блюд с названием 'Суп': " + restaurantOrder.itemQuantity("Суп"));
    }
}
