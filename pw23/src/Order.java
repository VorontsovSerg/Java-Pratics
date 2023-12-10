import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Order {
    private List<Dish> dishes;

    public Order() {
        this.dishes = new ArrayList<>();
    }

    public boolean add(Dish dish) {
        return dishes.add(dish);
    }

    public boolean remove(String dishName) {
        for (int i = dishes.size() - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(dishName)) {
                dishes.remove(i);
                return true;
            }
        }
        return false;
    }

    public int removeAll(String dishName) {
        int count = 0;
        for (int i = dishes.size() - 1; i >= 0; i--) {
            if (dishes.get(i).getName().equals(dishName)) {
                dishes.remove(i);
                count++;
            }
        }
        return count;
    }

    public int dishQuantity() {
        return dishes.size();
    }

    public int dishQuantity(String dishName) {
        int count = 0;
        for (Dish dish : dishes) {
            if (dish.getName().equals(dishName)) {
                count++;
            }
        }
        return count;
    }

    public Dish[] getDishes() {
        return dishes.toArray(new Dish[0]);
    }

    public double costTotal() {
        double sum = 0;
        for (Dish dish : dishes) {
            sum += dish.getCost();
        }
        return sum;
    }

    public String[] dishesNames() {
        List<String> names = new ArrayList<>();
        for (Dish dish : dishes) {
            names.add(dish.getName());
        }
        return names.toArray(new String[0]);
    }

    public Dish[] sortedDishesByCostDesc() {
        dishes.sort(Comparator.comparingDouble(Dish::getCost).reversed());
        return dishes.toArray(new Dish[0]);
    }

    public int itemQuantity(String dishName) {
        int count = 0;
        for (Dish dish : dishes) {
            if (dish.getName().equals(dishName)) {
                count++;
            }
        }
        return count;
    }
}
