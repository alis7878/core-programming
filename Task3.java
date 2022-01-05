import java.util.*;
import java.io.*;

public class Task3 {

    public static void main(String args[]) {
        int k = 0, d, f = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter String: ");
        String n = in.next();
        
        //p -> no. of alternate reverse
        System.out.println("Enter the no. of reverse elements");
        int p = in.nextInt();

        char[] ch = new char[n.length()];

        for (int j = 0; j < n.length(); j++) {
            ch[j] = n.charAt(j);
        }

        d = p - 1;
        f = d;
        
        //traversal 
        for (int i = 0; i < (n.length() / p); i++) {
            //reversing the characters
            for (int j = 0; j < p; j++) {
                ch[k] = n.charAt(d);
                d--;
                k++;
                f++;
            }
            d = f;
        }

        for (char c : ch) {
            System.out.print(c);
        }
    }
}
