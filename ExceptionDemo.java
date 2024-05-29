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
            System.out.println("Finally Block Executed");
        }
    }    
}