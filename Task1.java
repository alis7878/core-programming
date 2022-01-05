import java.util.*;
import java.io.*;

public class Task1
{

    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number of elements: ");
        int n = in.nextInt();
        
        System.out.println("Enter the numbers");
        int[] arr=new int[100];
            for(int j=0;j < n-1;j++)
            {
                arr[j] = in.nextInt();
            }
            int MAX = in.nextInt();
            MAX = arr[0];
        
            //finding max value
            for(int i=0;i<n;i++)
            {
                if(arr[i]>MAX)
                {
                    MAX = arr[i];      
                }   
            }
        System.out.println("Largest Number = " +MAX);
    }
}
