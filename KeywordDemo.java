// import keyword is used to include the Scanner class from java.util package
import java.util.Scanner;
public class KeywordDemo {
    private String message;

    // Constructor using this keyword
    KeywordDemo(String message) {
        this.message = message;
    }

    // Method to display the message
    public void displayMessage() {
        System.out.println(this.message);
    }
    public static void main(String[] args) {
        // Create a Scanner object using new keyword
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a message : ");
        String userMessage = sc.nextLine();

        // Create a Demo object using new keyword and pass userMessage
        KeywordDemo demo = new KeywordDemo(userMessage);

        // Display the message using displayMessage method
        demo.displayMessage();

        // Example usage of break and continue in a loop
        System.out.println("Loop demonstration with break and continue:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                // Skip even numbers
                continue;
            }
            if (i > 7) {
                // Exit loop if i is greater than 7
                break;
            }
            System.out.println("Number : " + i);
        }
        // Close the Scanner object
        sc.close();
    }
}