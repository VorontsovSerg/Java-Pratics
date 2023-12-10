class Matrix<T extends Number> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T[][] getMatrix() {
        return matrix;
    }

    public Matrix<T> add(Matrix<T> other) {
        if (matrix.length != other.getMatrix().length || matrix[0].length != other.getMatrix()[0].length) {
            throw new IllegalArgumentException("Матрицы разных размеров нельзя сложить");
        }

        T[][] result = (T[][]) new Number[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[i][j] = (T) Double.valueOf(matrix[i][j].doubleValue() + other.getMatrix()[i][j].doubleValue());
            }
        }
        return new Matrix<>(result);
    }

    public Matrix<Double> multiply(Matrix<Double> other) {
        if (matrix[0].length != other.getMatrix().length) {
            throw new IllegalArgumentException("Количество столбцов в первой матрице не совпадает с количеством строк во второй");
        }

        Double[][] result = new Double[matrix.length][other.getMatrix()[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < other.getMatrix()[0].length; j++) {
                double sum = 0;
                for (int k = 0; k < matrix[0].length; k++) {
                    sum += matrix[i][k].doubleValue() * other.getMatrix()[k][j].doubleValue();
                }
                result[i][j] = sum;
            }
        }
        return new Matrix<>(result);
    }
}
