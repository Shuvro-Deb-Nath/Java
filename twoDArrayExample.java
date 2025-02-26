import java.util.Scanner;

public class twoDArrayExample {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner sd = new Scanner(System.in);

        // Initialize a 2D array with 3 rows and 4 columns
        int[][] anArray = new int[3][4];
        System.out.println("Enter " + anArray.length + " rows and " + anArray[0].length + " columns:");

        // Loop through each row
        for (int i = 0; i < anArray.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < anArray[i].length; j++) {
                // Read input and assign it to the current element
                anArray[i][j] = sd.nextInt();
            }
        }

        // Print the array
        for (int row = 0; row < anArray.length; row++) {
            for (int column = 0; column < anArray[row].length; column++) {
                // Print each element followed by a space
                System.out.print(anArray[row][column] + " ");
            }
            // Move to the next line after printing all columns of the current row
            System.out.println();
        }

        // Calculate and print the sum of all elements in the array
        System.out.println("Sum of all elements is " + sum(anArray));
    }

    // Method to calculate the sum of all elements in a 2D array
    public static int sum(int[][] m) {
        int total = 0;
        // Loop through each row
        for (int r = 0; r < m.length; r++) {
            // Loop through each column in the current row
            for (int c = 0; c < m[r].length; c++) {
                // Add the current element to the total sum
                total += m[r][c];
            }
        }
        return total;
    }
}
