import java.util.Scanner;
import java.io.File;

public class WordCount{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is the file name? ");
        String filename = scan.next();
        
        File inputFile = new File(filename);
        Scanner in = new Scanner(inputFile);
        
        int countChars = 0;
        int countWords = 0;
        int countLines = 0;
        
        in.useDelimiter("");
        while(in.hasNext()){
            countChars++;}
        in.close();    
        System.out.println("Number of Characters: "+countChars);
    }
}