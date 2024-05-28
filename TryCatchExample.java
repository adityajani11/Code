import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Input for division operation
            System.out.print("Enter the numerator: ");
            int numerator = sc.nextInt();

            System.out.print("Enter the denominator: ");
            int denominator = sc.nextInt();

            // Perform division and print the result
            int result = numerator / denominator;
            System.out.println("The result is: " + result);

        } catch (ArithmeticException e) {
            // Catching arithmetic exceptions such as division by zero
            System.out.println("ArithmeticException caught: Cannot divide by zero.");

        } catch (InputMismatchException e) {
            // Catching input mismatch exceptions such as entering non-integer values
            System.out.println("InputMismatchException caught: Please enter valid integers.");

        } finally {
            // Closing the scanner resource
            sc.close();
        }
    }
}