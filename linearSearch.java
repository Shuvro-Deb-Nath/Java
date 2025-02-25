import java.util.Scanner;

public class linearSearch {
    public static void main(String[]args){
        searchFunction obj =new searchFunction();
        int [] array={1,2,3,4,5,6,7,8,9,10};
        Scanner sd =new Scanner(System.in);
        System.out.println("Enter the element you want :");
        int foundIt=sd.nextInt();
        obj.linearSearch(array, foundIt);
sd.close();
    }
}
class searchFunction{
    public void linearSearch (int[]array, int searchFor){
        int i;
        boolean foundIt =false;
        for( i=0;i<array.length;i++){
            if(array[i]==searchFor){
            foundIt=true;
            break;
            }
        }
        if(foundIt){
            System.out.println("Element found and it is at index  :"+i);
        }
        else{
            System.out.println("Element not found");
        }
    }
}