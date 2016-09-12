//To sum the numbers of array

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        int i;
        long sum = 0;
        for(i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
            sum = sum + arr[i];
        }
        System.out.print(sum);
    }
}
