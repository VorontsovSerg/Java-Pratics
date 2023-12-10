public class Main {
    public static void printMatrix(Matrix<?> matrix) {
        Object[][] matrixData = matrix.getMatrix();
        for (Object[] row : matrixData) {
            for (Object element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        System.out.println();
    }


    public static void main(String[] args) {
        MyGenericClass<Integer, Animal, String> myGenericObject = new MyGenericClass<>(10, new Animal(), "Hello");
        myGenericObject.printClassNames();

        Integer[] numbers = {3, 1, 7, 4, 2};
        MinMax<Integer> minMax = new MinMax<>(numbers);
        System.out.println("Минимальное значение: " + minMax.findMin());
        System.out.println("Максимальное значение: " + minMax.findMax());

        double sumResult = Calculator.sum(5, 3.5);
        System.out.println("Сумма: " + sumResult);

        Double[][] matrix1 = {{1.0, 2.0}, {3.0, 4.0}};
        Double[][] matrix2 = {{5.0, 6.0}, {7.0, 8.0}};

        Matrix<Double> m1 = new Matrix<>(matrix1);
        Matrix<Double> m2 = new Matrix<>(matrix2);

        System.out.println("\nМатрица 1:");
        printMatrix(m1);
        System.out.println("Матрица 2:");
        printMatrix(m2);

        try {
            Matrix<Double> m3 = m1.add(m2);
            System.out.println("Сумма матриц:");
            printMatrix(m3);

            Matrix<Double> m4 = m1.multiply(m2);
            System.out.println("Умножение матриц:");
            printMatrix(m4);

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
