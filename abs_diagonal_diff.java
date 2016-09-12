//To calculate the ABSOLUTE DIAGONAL DIFFERENCE of a 2-D array

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
        int a[][] = new int[n][n];
        int sum1 = 0, sum2 = 0, sum;
        for(int i=0; i < n; i++)
        {
            for(int j=0; j < n; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        for(int i=0; i < n; i++)
        {
            for(int j=0; j < n; j++)
            {
                if(i == j)
                {
                    sum1 = sum1 + a[i][j];
                }
                if((i+j) == (n-1))
                {
                    sum2 = sum2 + a[i][j];
                }
            }
        }
        //System.out.println(Math.abs(sum1));
        //System.out.println(Math.abs(sum2));
        sum = sum1 - sum2;
        System.out.println(Math.abs(sum));
    }
}
