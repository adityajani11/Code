import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        System.out.println("First element: " + numbers.get(0)); // Output: 10

        // Update an element in the ArrayList
        numbers.set(0, 5);
        System.out.println("Updated second element: " + numbers.get(0)); // Output: 5

        // Remove an element from the ArrayList
        numbers.remove(0);
        System.out.println("After removal, first element: " + numbers.get(0)); // Output: 20

        // Get the size of the ArrayList
        System.out.println("Size of ArrayList: " + numbers.size()); // Output: 2

        // Check if the ArrayList is empty
        System.out.println("Is ArrayList empty? " + numbers.isEmpty()); // Output: false
    }
}