public class arraySearch {
    public static void main(String[] args) {
        // Initialize the count variable to keep track of the number of 1s
        int count = 0;

        // Initialize and declare a 2D array with specific values
        int anArray[][] = {
            {1, 0, 1},
            {1, 0, 1},
            {1, 0, 1}
        };

        // Loop through each row of the array
        for (int i = 0; i < anArray.length; i++) {
            // Loop through each column of the current row
            for (int j = 0; j < anArray[i].length; j++) {
                // Check if the current element is 1
                if (anArray[i][j] == 1) {
                    // Increment the count variable if the element is 1
                    count++;
                }
            }
        }

        // Print the total number of 1s found in the array
        System.out.println("Number of 1s in the array is: " + count);
    }
}
