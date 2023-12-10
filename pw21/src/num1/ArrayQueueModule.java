package num1;

import java.util.NoSuchElementException;

class ArrayQueueModule implements Queue {
    private static Object[] elements = new Object[10];
    private static int size = 0;
    private static int head = 0;
    private static int tail = 0;

    public void enqueue(Object element) {
        ensureCapacity();
        elements[tail++] = element;
        size++;
        tail %= elements.length;
    }

    public Object element() {
        if (size == 0) throw new NoSuchElementException("Очередь пустая");
        return elements[head];
    }

    public Object dequeue() {
        if (size == 0) throw new NoSuchElementException("Очередь пустая");
        Object element = elements[head];
        elements[head++] = null;
        size--;
        head %= elements.length;
        return element;
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear() {
        elements = new Object[10];
        size = 0;
        head = 0;
        tail = 0;
    }

    private void ensureCapacity() {
        if (size == elements.length) {
            Object[] newElements = new Object[elements.length * 2];
            System.arraycopy(elements, head, newElements, 0, elements.length - head);
            System.arraycopy(elements, 0, newElements, elements.length - head, tail);
            elements = newElements;
            head = 0;
            tail = size;
        }
    }

    public static void main(String[] args) {
        ArrayQueueADT queue = new ArrayQueueADT();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.element());
        System.out.println(queue.dequeue());
        System.out.println(queue.size());
        System.out.println(queue.isEmpty());
        queue.clear();
        System.out.println(queue.isEmpty());
    }
}
