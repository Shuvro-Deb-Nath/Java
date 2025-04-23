import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class readCSV {
    public static void main(String[] args) {
       
        String fileName="d:/devFile.txt";
        BufferedReader br=null;
        FileReader fr= null;
        String line="";
        String csvSplitBy=",";
         try { br = new BufferedReader(new FileReader(fileName));

            while ((line=br.readLine())!=null) {
                String [] info=line.split(csvSplitBy);
                System.out.println("Student id:"+info[0]);
                System.out.println("Student Name:"+info[1]);
                System.out.println("Student department:"+info[2]);
                System.out.println("Student department:"+info[3]);
            }
            br.close();
}catch(IOException io){
    System.out.println("Error"+ io.getMessage());
}
    }
}
