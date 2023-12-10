package num3;

import java.io.*;

public class Number3 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            System.out.println("Введите новую информацию для замены в файле (для завершения введите 'exit'):");

            String input;
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            writer.close();
            reader.close();

            System.out.println("Информация была заменена в файле.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
