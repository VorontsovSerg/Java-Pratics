package num4;

import java.io.*;

public class Number4 {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt", true));

            System.out.println("Введите текст для добавления в конец файла (для завершения введите 'exit'):");

            String input;
            while (!(input = reader.readLine()).equalsIgnoreCase("exit")) {
                writer.write(input);
                writer.newLine();
            }

            writer.close();
            reader.close();

            System.out.println("Текст был добавлен в конец файла.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
