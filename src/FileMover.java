import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileMover {

    public static void FileMove(String[] args){

        try{

            Path original = Paths.get("src/temp/test.txt");
            Path destination = Paths.get("C:/Users/Main/Desktop/Coding/FileTransfer/src/test.txt");

            Scanner scanner = new Scanner(System.in);
            String choice = "";

            System.out.print("are you sure you want to move this file from " + original.toAbsolutePath());
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")){
                Files.move(original, destination);
                System.out.println("Ok, We have move this file to " + destination.toAbsolutePath());
            } else {
                if(choice.equalsIgnoreCase("no")){
                    System.out.println("Ok, we didn't move this file");
                }else{
                    System.out.println("Sorry, we didn't recognise your response, as a result we did not move your file");
                }
            }

            System.out.println("would you like to move the file back?");
            choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("yes")){
                Files.move(destination, original);
                System.out.println("Ok, we have moved this file to " + original.toAbsolutePath());
            } else {
                if(choice.equalsIgnoreCase("no")){
                    System.out.println("Ok, we didn't move this file");
                }else{
                    System.out.println("Sorry, we didn't recognise your response, as a result we did not move your file");
                }
            }

        } catch (IOException e){
            e.printStackTrace();

        }

    }

}
