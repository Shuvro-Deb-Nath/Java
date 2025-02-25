import java.util.Scanner;

public class ContinueExample {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter the number of inputs:");
        Scanner sd = new Scanner(System.in);
        n = sd.nextInt(); // Read an integer

        double number, sum = 0.0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(i+1+".");
            number = sd.nextDouble();
            // if the number is negative
            // continue statement is executed
            if (number <= 0.0) {
                continue;
            }
            sum = sum + number;
        }
        System.out.println("The sum of the positive numbers is: " + sum);
    }
}
