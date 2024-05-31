import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortUserInputArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Get user input for the number of elements
        System.out.print("Enter the number of elements to add : ");
        int numElements = sc.nextInt();

        // Get user input for each element
        System.out.println("Enter " + numElements + " integers:");
        for (int i = 0; i < numElements; i++) {
            numbers.add(sc.nextInt());
        }
        // Sort the ArrayList in descending order
        Collections.sort(numbers, Collections.reverseOrder());
        // Display the sorted elements
        System.out.println("Sorted elements in descending order:");
        for (int number : numbers) {
            System.out.println(number);
        }
        sc.close();
    }
}