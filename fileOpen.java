import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;
import java.util.Scanner;

public class fileOpen {
    public static void main(String[] args) {
        fileread reader = new fileread();
        String filePath = "D:\\60A\\myFile.txt";

        reader.readFile(filePath);
        reader.readFileLine(filePath);
        reader.readFileUsingScanner(filePath);
    }
}

class fileread {

    // Method 1: Read character by character
    public void readFile(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\nRead the text file using read() method:");
            int num;
            while ((num = br.read()) != -1) {
                char ch = (char) num;
                System.out.print(ch);
            }
        } catch (IOException io) {
            System.err.println("An error occurred while reading the file:");
            io.printStackTrace();
        }
    }

    // Method 2: Read line by line
    public void readFileLine(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            System.out.println("\n\nRead the text file line by line:");
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException io) {
            System.err.println("An error occurred while reading the file:");
            io.printStackTrace();
        }
    }

    // Method 3: Using Scanner
    public void readFileUsingScanner(String fileName) {
        try {
            File file = new File(fileName);
            Scanner sd = new Scanner(file);
            System.out.println("\nRead the text file using Scanner:");
            while (sd.hasNextLine()) {
                System.out.println(sd.nextLine());
            }
            sd.close();
        } catch (IOException io) {
            System.err.println("Error reading file:");
            io.printStackTrace();
        }
    }
}
