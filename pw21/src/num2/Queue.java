package num2;

interface Queue<T> {
    void enqueue(T element);
    T dequeue();
    T peek();
    int size();
    boolean isEmpty();
    void clear();
}
