//to output the series 

import java.util.*;
import java.io.*;
import java.math.*;

class Solution
{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int q=in.nextInt();
        double[] arr = new double[20];
        for(int i=0;i<q;i++)
        {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            arr[0] = a + (Math.pow(2,0)*b);
            System.out.print((int)arr[0] + " ");
            for(int j = 1; j < n; j++)
            {
                arr[j] = arr[j-1] + (Math.pow(2,j)*b);
                System.out.print((int)arr[j] + " ");
            }
            System.out.println();
        }
        in.close();
    }
}

