import java.util.*;
import java.io.*;

public class Task2 {

    public static void main(String args[]) {

        String n;
        String[] a;
        int[] arr;
        int index = 0;

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Numbers with comma separated string: ");
        //n -> string with coma separator
        n = in.nextLine();
        
        //a -> string without coma separator
        a = n.split(",");
        arr = new int[a.length];
        
        //parsing string into integer values
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(a[i]);
        }
        
        //finding max value
        int MAX = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > MAX) {
                MAX = arr[i];
            }
        }
        System.out.println("Largest Number = " + MAX);
    }
}
