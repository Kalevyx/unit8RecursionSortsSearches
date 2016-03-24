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
            System.out.println("Number of Words: "+countWords);
            while(in.hasNextByte()){
                in.nextByte();
                countChars++;}
            System.out.println("Number of Characters: "+countChars);
            while(in.hasNextLine()){
                in.nextLine();
                countLines++;}
            in.close();
            System.out.println("Number of Lines: "+countLines);}
            
        catch(FileNotFoundException exception){
            System.out.println("File not found");}
    }
}