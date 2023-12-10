import java.util.Scanner;

public class Exception2 {
    /*public void exceptionDemo() {
        Scanner myScanner = new Scanner( System.in);
        System.out.print( "Enter an integer ");
        String intString = myScanner.next();
        int i = Integer.parseInt(intString);
        System.out.println( 2/i );
    }*/
    public void exceptionDemo() {
        Scanner myScanner = new Scanner(System.in);
        try {
            System.out.print("Enter an integer: ");
            String intString = "10";
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Exception2 task = new Exception2();
        task.exceptionDemo();
    }
}
/*
Преобразует строку в тип int и выполняет операцию деления.

исключения:

1)"Qwerty": В этом случае, метод Integer.parseInt(intString) выбросит исключение NumberFormatException.
Это происходит потому, что строка "Qwerty" не может быть преобразована в целое число.
2)"0": Когда вводится "0", выражение 2 / i приведет к делению на ноль, вызывая исключение ArithmeticException.
3)"1.2": Попытка преобразования строки "1.2" в целое число методом Integer.parseInt(intString) также вызовет исключение
NumberFormatException, так как "1.2" не является целым числом.
*/

