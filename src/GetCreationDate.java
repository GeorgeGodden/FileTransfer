import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;

public class GetCreationDate {

    public static void Created(String[] args){

        try{
            File file = new File("C:/Users/Main/Desktop/Coding/FileTransfer/src/temp/test.txt");
            Path filepath = file.toPath();
            BasicFileAttributes attr = Files.readAttributes(filepath, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
        }catch(Exception e){
            e.printStackTrace();
        }

    }

}
