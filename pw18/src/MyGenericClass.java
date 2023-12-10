class MyGenericClass<T extends Comparable<T>, V extends Animal, K> {
    private T var1;
    private V var2;
    private K var3;

    public MyGenericClass(T var1, V var2, K var3) {
        this.var1 = var1;
        this.var2 = var2;
        this.var3 = var3;
    }

    public T getVar1() {
        return var1;
    }

    public V getVar2() {
        return var2;
    }

    public K getVar3() {
        return var3;
    }

    public void printClassNames() {
        System.out.println("Тип переменной var1: " + var1.getClass().getSimpleName());
        System.out.println("Тип переменной var2: " + var2.getClass().getSimpleName());
        System.out.println("Тип переменной var3: " + var3.getClass().getSimpleName());
    }
}

