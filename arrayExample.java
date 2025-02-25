import java.util.Scanner;

public class arrayExample {
    public static void main(String[] args) {
        myArray obj = new myArray();
        obj.enterMarks();
        obj.printMarks();
        obj.totalMarks();
        obj.averageMarks();
        obj.findMax();
        obj.findMin();
    }
}

class myArray {
    Scanner sd = new Scanner(System.in);
    int n; // Declare n as a class variable
    int[] marks;
    double total = 0;

    // Constructor to initialize 'n' and the array
    public myArray() {
        System.out.println("Enter the number of marks you want to enter:");
        n = sd.nextInt(); // Input for the number of marks
        marks = new int[n]; // Initialize the array dynamically
    }

    public void enterMarks() {
        System.out.println("Enter " + n + " marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sd.nextInt();
        }
    }

    public void printMarks() {
        System.out.println("The marks you entered are:");
        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i] + " ");
        }
        System.out.println(); // Print a newline for better formatting
    }

    public void totalMarks() {
        System.out.println("Calculating the total marks...");
        for (int i = 0; i < marks.length; i++) {
            total += marks[i];
        }
        System.out.println("The total marks is: " + total);
    }

    public void averageMarks() {
        double avg = total / marks.length; // Use marks.length, which equals 'n'
        System.out.println("The average marks is: " + avg);
    }

    public void findMax() {
        int max = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        System.out.println("The maximum marks is: " + max);
    }

    public void findMin() {
        int min = marks[0];
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        System.out.println("The minimum marks is: " + min);
    }
}
