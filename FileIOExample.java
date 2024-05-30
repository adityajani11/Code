import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileIOExample {
    public static void main(String[] args) {
        String sourceFile = "input.txt";
        String destFile = "output.txt";

        // Define FileInputStream and FileOutputStream outside try block for visibility
        // in finally block
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // Create FileInputStream to read the source file
            fis = new FileInputStream(sourceFile);
            // Create FileOutputStream to write to the destination file
            fos = new FileOutputStream(destFile);

            // Buffer to hold byte data
            byte[] buffer = new byte[1024];
            int bytesRead;

            // Read bytes from the source file and write them to the destination file
            while ((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
            }
            
            System.out.println("File copied successfully!");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            // Close the streams to release resources
            try {
                if (fis != null) {
                    fis.close();
                }
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException ioe) {
                System.out.println("Error closing the stream: " + ioe.getMessage());
            }
        }
    }
}