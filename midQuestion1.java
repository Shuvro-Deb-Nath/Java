import java.util.InputMismatchException;
import java.util.Scanner;

public class midQuestion1 {
    public static void main(String[] args) {
        try {
            myArray obj = new myArray();
            obj.enterMarks();
            obj.printMarks();
            obj.totalMarks();
            obj.averageMarks();
            obj.standardDeviation();
            obj.numberOfItemsLessThanAverage();
            obj.arrayValuesAreInSortedIncreasingOrderOrNot();
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input type. Please enter integers only.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}

class myArray {
    Scanner sd = new Scanner(System.in);
    int n;
    int[] marks;
    double total = 0;

    public myArray() {
        System.out.print("Enter the number of marks you want to enter: ");
        n = sd.nextInt();

        if (n <= 0) {
            throw new IllegalArgumentException("Number of inputs is out of range. Must be greater than 0.");
        }

        marks = new int[n];
    }

    public void enterMarks() {
        System.out.println("Enter " + n + " marks:");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = sd.nextInt();
        }
    }

    public void printMarks() {
        System.out.println("The marks you entered are:");
        for (int mark : marks) {
            System.out.print(mark + " ");
        }
        System.out.println();
    }

    public void totalMarks() {
        total = 0;
        for (int mark : marks) {
            total += mark;
        }
     
    }

    public void averageMarks() {
        double avg = total / marks.length;
        System.out.println("The average marks is: " + avg);
    }

    public void standardDeviation() {
        if (marks.length < 2) {
            System.out.println("Error: Cannot compute standard deviation with only one input.");
            return;
        }

        double mean = total / marks.length;
        double sum = 0;
        for (int mark : marks) {
            sum += Math.pow(mark - mean, 2);
        }
        double stdDev = Math.sqrt(sum / marks.length);
        System.out.println("The standard deviation is: " + stdDev);
    }

    public void numberOfItemsLessThanAverage() {
        double avg = total / marks.length;
        int count = 0;
        for (int mark : marks) {
            if (mark < avg) {
                count++;
            }
        }
        System.out.println("Number of items less than the average: " + count);
    }

    public void arrayValuesAreInSortedIncreasingOrderOrNot() {
        boolean sorted = true;
        for (int i = 1; i < marks.length; i++) {
            if (marks[i] < marks[i - 1]) {
                sorted = false;
                break;
            }
        }
        if (sorted) {
            System.out.println("The array values are in sorted increasing order.");
        } else {
            System.out.println("The array values are NOT in sorted increasing order.");
        }
    }
}
