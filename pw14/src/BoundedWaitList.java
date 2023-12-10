import java.util.Collection;

public class BoundedWaitList<E> extends WaitList<E> {

    private int capacity;

    public BoundedWaitList(int capacity){
        super();
        if(capacity <= 0) throw new IllegalArgumentException("Максимальный размер должен быть больше 0! Получено значение: " + capacity);
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public void add(E element) {
        if(components.size() == capacity) {
            System.out.println("Очередь переполнена! Удаление первого элемента");
            components.poll();
        }
        components.add(element);
    }

    @Override
    public String toString() {
        return "BoundedWaitList{" + "capacity=" + capacity + ", components=" + components + "}";
    }
}
