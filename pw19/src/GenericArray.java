class GenericArray<T> {
    private T[] array;

    public GenericArray(T[] array) {
        this.array = array;
    }

    public T getElementAtIndex(int index) {
        return array[index];
    }
}
