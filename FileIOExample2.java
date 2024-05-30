import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIOExample2 {
    public static void main(String[] args) {
        // Define the file paths
        String inputFilePath = "input.txt";
        String outputFilePath = "output.txt";

        // Use FileReader to read from the input file
        try (FileReader fileReader = new FileReader(inputFilePath);
                FileWriter fileWriter = new FileWriter(outputFilePath)) {

            int character;
            // Read characters from the input file and write them to the output file
            while ((character = fileReader.read()) != -1) {
                fileWriter.write(character);
            }

            System.out.println("File content has been copied from input.txt to output.txt");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}