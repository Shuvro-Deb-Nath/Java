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
        String myContent ="This line would be written into file new add  thid time w2 jim";
        File  file = new File("D:/myFile1.txt");
        if(!file.exists()){
            file.createNewFile();

        }

        fw= new FileWriter(file,true);
        bw = new BufferedWriter(fw);
        bw.write(myContent);
bw.newLine();
        System.out.println("Written into file successfuly");
        bw.close();

    } catch(IOException io){
System.out.println("Error founfd "+ io.getMessage());
    }
}
}
