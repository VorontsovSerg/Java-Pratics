package num2;
import java.util.NoSuchElementException;

class LinkedQueue<T> implements Queue<T> {
    private Node<T> head;
    private Node<T> tail;
    private int size;

    private static class Node<T> {
        T data;
        Node<T> next;

        Node(T data) {
            this.data = data;
        }
    }

    public void enqueue(T element) {
        Node<T> newNode = new Node<>(element);
        if (isEmpty()) {
            head = newNode;
        } else {
            tail.next = newNode;
        }
        tail = newNode;
        size++;
    }

    public T dequeue() {
        if (isEmpty()) throw new NoSuchElementException("Очередь пустая");
        T data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return data;
    }

    public T peek() {
        if (isEmpty()) throw new NoSuchElementException("Очередь пустая");
        return head.data;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    public static void main(String[] args) {
        LinkedQueue<Integer> queue = new LinkedQueue<>();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Элемент в начале очереди: " + queue.peek()); // Ожидаемый результат: 10

        System.out.println("Удаленный элемент: " + queue.dequeue()); // Ожидаемый результат: 10

        System.out.println("Размер очереди: " + queue.size()); // Ожидаемый результат: 2

        System.out.println("Очередь пустая? " + queue.isEmpty()); // Ожидаемый результат: false

        queue.clear();

        System.out.println("Размер очереди после очистки: " + queue.size()); // Ожидаемый результат: 0
        System.out.println("Очередь пустая после очистки? " + queue.isEmpty()); // Ожидаемый результат: true
    }
}
