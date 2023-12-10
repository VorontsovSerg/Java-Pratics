public class Main {
    public static void main(String[] args) {
        // Задание 1
        Drink drink1 = new Drink("Cola", "Освежающий напиток кола");
        Drink drink2 = new Drink(2.5, "Апельсиновый сок", "Свежевыжатый апельсиновый сок");

        System.out.println("Название напитка 1: " + drink1.getName());
        System.out.println("Стоимость напитка 1: $" + drink1.getCost());
        System.out.println("Описание напитка 1: " + drink1.getDescription());

        System.out.println("Название напитка 2: " + drink2.getName());
        System.out.println("Стоимость напитка 2: $" + drink2.getCost());
        System.out.println("Описание напитка 2: " + drink2.getDescription());

        // Задание 2
        Dish dish1 = new Dish(15.0, "Пицца", "Сочная итальянская пицца");
        Dish dish2 = new Dish(10.0, "Салат", "Свежий салат с овощами");

        TablesOrderManager orderManager = new TablesOrderManager();
        orderManager.add(new Order(), 1);
        orderManager.addDish(dish1, 1);
        orderManager.addDish(dish2, 1);

        System.out.println("\nКоличество свободных столов: " + orderManager.freeTableNumbers());
        System.out.println("Стоимость всех заказов: $" + orderManager.ordersCostSummary());
        System.out.println("Количество блюд 'Пицца' в заказах: " + orderManager.dishQuantity("Пицца"));

        // Задание 3
        InternetOrder internetOrder = new InternetOrder(new Item[]{drink1, dish1, drink2});
        internetOrder.addItem(dish2);
        internetOrder.remove("Салат");
        System.out.println("\nОбщая стоимость заказа: $" + internetOrder.costTotal());
        System.out.println("Количество заказанных элементов: " + internetOrder.itemsQuantity());
        System.out.println("Названия заказанных элементов: " + String.join(", ", internetOrder.itemsNames()));
    }
}
