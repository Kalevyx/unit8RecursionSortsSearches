import java.util.*;

public class ListMethods
{
    public static ArrayList<Integer> makeList(int n)
    {
        ArrayList<Integer> tempList = null;
        
        if (n <= 0)  // The smallest list we can make
        {
            tempList = new ArrayList<Integer>();
        }
        else        // All other size lists are created here
        {
            tempList = new ArrayList<Integer>(n);
            tempList.add(n);
            makeList(n-1);
        }
        return tempList;
    }
    
    public static ArrayList<Integer> reverseList(ArrayList<Integer> list){}
    
    public static ArrayList<Integer> deepClose(ArrayList<Integer> tList){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(Integer i: tList){list.add(new Integer(i));}
        return list;}
}