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
            ListMethods.makeList(n-1);
            
        }
        return tempList;
    }
}