import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class WordCount{
    public static void main(String[]args)
    {
        
        try{
            Scanner scan = new Scanner(System.in);
            System.out.print("What is the file name? ");
            String filename = scan.next();
            
            File inputFile = new File(filename);
            Scanner in = new Scanner(inputFile);
            
            in.useDelimiter("");
            
            int countChars = 0;
            int countWords = 0;
            int countLines = 0;
            while(in.hasNext()){
                in.next();
                countWords++;}
            in.close();    
            System.out.println("Number of Words: "+countWords);
            while(}
            
        catch(FileNotFoundException exception){
            System.out.println("File not found");}
    }
}