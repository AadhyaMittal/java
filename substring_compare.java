//In the first line print the lexicographically minimum substring. In the second line print the lexicographically maximum substring.

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
     public static void main(String[] args) 
     {
         Scanner scan = new Scanner(System.in);
         String str = scan.next();
         int n = scan.nextInt();
         int i;
         int l = str.length();
        // System.out.println(l);
         String min = str.substring(0,n);
         String max = str.substring(0,n);
         String sub;
         for(i = 1; i <= l - n ; i++)
         {
             sub = str.substring(i,i+n);
             if(sub.compareTo(min) < 0)
             {
                 min = sub;
             }
             if(sub.compareTo(max) > 0)
             {
                 max = sub;
             }
         }
         System.out.println(min);
         System.out.println(max);
     }
}
