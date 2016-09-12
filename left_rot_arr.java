/*A left rotation operation on an array of size n shifts each of the array's elements 1 unit to the left.
For example, if 2 left rotations are performed on array [1,2,3,4,5], then the array would become [3,4,5,1,2] .

Given an array of n integers and a number,d , perform d left rotations on the array. 
Then print the updated array as a single line of space-separated integers.*/

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
        int d = scan.nextInt();
        int arr[] = new int[n];
        int a[] = new int[n];
        int i, j;
        for(i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }
        j = 0;
        for(i = d; i < n; i++)
        {
            a[j] = arr[i];
            j++;
        }
        for(i = 0; i < d; i++)
        {
            a[j] = arr[i];
            j++;
        }
        for(i = 0; i < n; i++)
        {
            System.out.print(a[i]+" ");
        }
    }
}
