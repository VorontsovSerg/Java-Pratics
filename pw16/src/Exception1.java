public class Exception1 {
    public void exceptionDemo() {
        System.out.println( 2 / 0 );
        /*
        try{
            System.out.println( 2/0 );
        } catch ( ArithmeticException e ) {
            System.out.println("Attempted division by zero");
        }
        */
    }
    public static void main(String[] args) {
        Exception1 task = new Exception1();
        task.exceptionDemo();
    }
}