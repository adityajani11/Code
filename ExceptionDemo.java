public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            int arr[] = { 10, 20, 30 };
            System.out.println(arr[4]); // This will throw ArrayIndexOutOfBoundsException
            System.out.println(10 / 0); // This will throw ArithmeticException
            String str1 = null;
            System.out.println(str1.length()); // This will throw NullPointerException
        } catch (ArrayIndexOutOfBoundsException are) {
            System.out.println("ArrayIndexOutOfBoundsException Occurred");
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException Occurred");
        } catch (NullPointerException ne) {
            System.out.println("NullPointerException Occurred");
        } finally {
            // Java finally block is a block used to execute important code such as closing the connection, etc.
            // Java finally block is always executed whether an exception is handled or not.
            // Therefore, it contains all the necessary statements that need to be printed regardless of the exception occurs or not.
            System.out.println("Finally Block Executed");
        }
    }    
}
