import java.util.Scanner;

public class switchExample {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        char ch;
        int num1, num2, choice;

        do {
            System.out.println("First number");
            num1 = sd.nextInt();
            System.out.println("Second number");
            num2 = sd.nextInt();
            System.out.println("Enter your choice \n1. Addition\n2. Subtraction\n3. Exit");
            choice = sd.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Result: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Result: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Exiting...");
                    sd.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, or 3.");
                    break;
            }

            System.out.println("Want to continue? Enter Y for yes or N for no");
            ch = sd.next().charAt(0);
        }
        while (ch == 'Y' || ch == 'y');
        
        sd.close(); // Close the scanner after the loop
    }
}
