//There are N strings. Each string's length is no more than 20 characters. There are also Q queries.
For each query, you are given a string, and you need to find out how many times this string occurred previously.

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
        int n = scan.nextInt();
        String str[] = new String[n];
        int i, j, count;
        for(i = 0; i < n; i++)
        {
            str[i] = scan.next();
        }
        int q = scan.nextInt();
        String arr[] = new String[q];
        for(i = 0; i < q; i++)
        {
            arr[i] = scan.next();
        }
        for(i = 0; i < q; i++)
        {
            count = 0;
            for(j = 0; j < n; j++)
            {
                if(arr[i].equals(str[j]))
                {
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
