public class scoreCalculation {
    public static void main(String[] args) {
        // Define a 2D array to store students' answers
        char [][] answers = {
            {'A', 'E', 'C', 'C', 'D', 'E', 'E', 'F', 'D', 'A'},
            {'A', 'B', 'D', 'E', 'D', 'C', 'E', 'F', 'F', 'E'},
            {'B', 'C', 'E', 'D', 'A', 'E', 'D', 'E', 'D', 'A'}
        };

        // Define an array to store the correct answers (answer key)
        char keys[] = {'A', 'B', 'E', 'D', 'B', 'C', 'E', 'A', 'F', 'E'};

        // Loop through each student's answers
        for (int i = 0; i < answers.length; i++) {
            int count = 0; // Reset count for each student
            System.out.print((i + 1) + "th student's total correct answers is " + count + ". Correct questions: ");
            
            // Loop through each answer of the current student
            for (int j = 0; j < answers[i].length; j++) {
                // Compare the student's answer to the correct answer key
                if (answers[i][j] == keys[j]) {
                    count++; // Increment count if the answer is correct
                    System.out.print((j + 1) + " "); // Print the question number that was answered correctly
                }
            }
            System.out.println(); // Print new line after each student's results
        }
    }
}
