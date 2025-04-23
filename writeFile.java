import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.Buffer;

public class writeFile {
    public static void main(String[] args) {

        try {
        BufferedWriter bw=null;
        FileWriter fw= null;
        String myContent ="This line would be written into file";
        File  file = new File("D:/myFile1.txt");
        if(!file.exists()){
            file.createNewFile();

        }

        fw= new FileWriter(file);
        bw = new BufferedWriter(fw);
        bw.write(myContent);
        System.out.println("Written into file successfuly");
        bw.close();

    } catch(IOException io){
System.out.println("Error founfd "+ io.getMessage());
    }
}
}
