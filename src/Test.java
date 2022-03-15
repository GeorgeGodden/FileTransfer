import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

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
