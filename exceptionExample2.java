
import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExample2 {

    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);
        System.out.println("Enter a divisor to devide 400");

        try {
            int divisor = sd.nextInt();
            int[] anArrray = new int[9];
            int result = 400 / divisor;
            anArrray[8] = result;
            System.out.println("value is " + anArrray[8]);
        } catch (ArithmeticException e) {
            System.out.println("error is" + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error" + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Error " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        } finally {
            System.out.println("System devide by 1");
            int div = 1;
            int ans = 400 / div;
            System.out.println("Result " + ans);//finaly is irrelevant here 
        }

    }
}
