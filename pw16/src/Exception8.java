import java.util.Scanner;

public class Exception8 {
    public void getKey() {
        Scanner myScanner = new Scanner(System.in);
        boolean isValidKey = false;

        while (!isValidKey) {
            System.out.print("Enter a key: ");
            String key = myScanner.next();

            try {
                printDetails(key);
                isValidKey = true;
            } catch (Exception e) {
                System.out.println("Caught Exception: " + e.getMessage());
                System.out.println("Please try again.");
            }
        }
    }

    public void printDetails(String key) throws Exception {
        String message = getDetails(key);
        System.out.println(message);
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exception8 demo = new Exception8();
        demo.getKey();
    }
}
