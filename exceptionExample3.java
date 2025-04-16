
import java.util.Scanner;

public class exceptionExample3 {
    public static void main(String[] args) {
        int age=0;
        Scanner sd=new Scanner(System.in);
        try {
            age=sd.nextInt();
            if(age<=0)
                throw new Exception("Positive number requiers");
              System.out.println("Age is "+age);  
            
        } catch (Exception e) {
            System.out.println("Error: "+ e.getMessage());
        }
    }
    
}
