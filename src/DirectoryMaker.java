import java.io.File;
import java.util.Scanner;

public class DirectoryMaker {

    public static void MakeDirectory(String[] args){
        try{

            File theDir = new File("C:/Users/Main/Desktop/Coding/FileTransfer/src/temp/new");
            //filepath must have the name of the new Directory at the end of it
            Scanner scanner = new Scanner(System.in);
            String choice = "";

            System.out.print("would you like to create the new directory");

            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")) {

                if (!theDir.exists()) {
                    theDir.mkdirs();
                } else{
                    System.out.println("this Directory already exists");
                }
            }else{
                System.out.println("We have not created a new Directory");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
