import java.util.Arrays;

public class BubbleSort{
    public static int[] swap(int[] a){
        for(int i = 1; i <= a.length-1; i++){
            if(a[i] < a[i-1]){
                int temp = a[i];
                a[i] = a[i-1];
                a[i-1] = temp;}}
                
        return a;}
                
    public static void main(String[] args){
        int[] a = ArrayUtil.randomIntArray(20, 100);
        System.out.println(Arrays.toString(a));
        
        BubbleSort.swap(a);
        System.out.println(Arrays.toString(a));}}