import java.util.Scanner;

public class OnlinePurchase {
    public boolean validateINN(String inn) {
        return inn != null && inn.length() == 12;
    }

    public static void main(String[] args) {
        OnlinePurchase purchase = new OnlinePurchase();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите ИНН: ");
        String inn = scanner.nextLine();

        try {
            if (purchase.validateINN(inn)) {
                System.out.println("ИНН действителен для этого клиента.");
            } else {
                throw new Exception("Недействительный ИНН!");
            }
        } catch (Exception e) {
            System.out.println("Ошибка при проверке ИНН: " + e.getMessage());
        }
    }
}
