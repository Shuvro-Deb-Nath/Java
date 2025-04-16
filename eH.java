

public class eH {
    public static void main(String[] args) {
        int a = 10;
         int b = 0;
    
        try {
            int c = a / b; // This will cause an ArithmeticException
            System.out.println(c);
        } catch (ArithmeticException ex) {
             ex.printStackTrace();//define error in java class 
            System.out.println("Error: " + ex.getMessage());
        }finally{
            System.out.println("dev");

        }
    }
}
