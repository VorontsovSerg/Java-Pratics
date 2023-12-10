import java.lang.*;
public class TestDog {
    public static void main(String[] args) {
        Dog myDog = new Dog("Бадди", 3);
        System.out.println(myDog);

        myDog.setName("Макс");
        myDog.setAge(5);

        System.out.println("Обновленная информация о собаке:");
        System.out.println(myDog);
    }
}