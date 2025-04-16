
import java.util.InputMismatchException;
import java.util.Scanner;

public class exception1 {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        int age;
        Scanner sd=new Scanner(System.in);
         try {
            System.out.print("Enter your age: ");
           age = sd.nextInt(); // Attempt to read an integer

            // Check if the age is negative
            if (age < 0) {
                throw new IllegalArgumentException("Age cannot be negative.");
            }

            // If the input is valid (non-negative integer)
            System.out.println("You are " + age + " years old.");

        } catch (InputMismatchException ex) {
            // Handle case where input is not an integer
            System.out.println("Error: Please enter a valid integer for your age.");
        } catch (IllegalArgumentException ex) {
            // Handle case where age is negative
            System.out.println("Error: " + ex.getMessage());
        } finally {
            // Close the scanner to prevent resource leak
            sd .close();

        }
        


    }
    
}
