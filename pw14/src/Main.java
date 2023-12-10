import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        WaitList wl = new WaitList<>();
        wl.add("Hi");
        wl.add("Hi2");
        wl.add("Hi3");
        System.out.println(wl);
        System.out.println("Убираем первый элемент: " + wl.remove());
        System.out.println(wl);
        System.out.println("Убираем первый элемент: " + wl.remove());
        System.out.println(wl);
        System.out.println("Убираем первый элемент: " + wl.remove());
        System.out.println(wl);
        System.out.println("Проверка на пустоту: " + wl.isEmpty());

        System.out.println();

        BoundedWaitList bwl = new BoundedWaitList<>(3);
        bwl.add("раз");
        bwl.add("два");
        bwl.add("три");
        System.out.println(bwl);
        try{
            bwl.add("четыре");
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println();
        System.out.println(bwl);
        System.out.println(bwl.getCapacity());

        System.out.println();

        UnfairWaitList uwl = new UnfairWaitList<>();
        uwl.add(1);
        uwl.add(2);
        uwl.add(23);
        uwl.add(5);
        uwl.add(5);
        uwl.add(6);
        System.out.println(uwl);
        uwl.remove(5);
        System.out.println(uwl);
        uwl.moveToBack(23);
        System.out.println(uwl);
    }
}