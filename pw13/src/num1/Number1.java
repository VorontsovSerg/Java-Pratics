package num1;

import java.io.*;

public class Number1 {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите информацию для записи в файл (для завершения введите 'exit'):");

            String input;
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            writer.close();
            reader.close();

            System.out.println("Информация была записана в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
