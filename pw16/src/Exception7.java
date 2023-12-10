import java.util.Scanner;

public class Exception7 {
    public void getKey(String key) {
        try {
            printDetails(key);
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    public void printDetails(String key) throws Exception {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (Exception e) {
            throw e;
        }
    }

    private String getDetails(String key) throws Exception {
        if (key.equals("")) {
            throw new Exception("Key set to empty string");
        }
        return "data for " + key;
    }

    public static void main(String[] args) {
        Exception7 demo = new Exception7();
        try {
            demo.getKey("exampleKey");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}