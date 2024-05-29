import java.io.FileOutputStream;
import java.io.IOException;

public class WriteTextFileExample {
    public static void main(String[] args) {
        String text = "Hello, this is a sample text file.";

        try (FileOutputStream fos = new FileOutputStream("sample.txt")) {
            // Convert the text to bytes
            byte[] bytes = text.getBytes();

            // Write the bytes to the file
            fos.write(bytes);

            System.out.println("Text has been written to sample.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}