//To implement MERGE SORT in java

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uca_datastructures;

import java.util.*;

/**
 *
 * @author AADYA
 */
public class merge_sort 
{
    private static void merge_sort(int arr[], int beg, int end)
    {
        int mid;
        if(beg < end)
         {
             mid = (beg + end)/2;
             merge_sort(arr, beg, mid);
             merge_sort(arr, mid+1, end);
             merge(arr, beg, mid, end);             
         }
    }
    private static void merge(int arr[], int beg, int mid,int end)
    {
        int i, j, k = beg, x;
        int temp[] = new int[20];
        i = beg;
        j = mid+1;
        while((i <= mid) && (j <= end))
        {
             if(arr[i] < arr[j])
            {
                temp[k] = arr[i];
                i++;
            }
            else 
            {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }
        if(i > mid)
        {
            while(j <= end)
            {
                temp[k] = arr[j];
                j++;
                k++;
            }
        }
        else if( j > end)
        {
            while(i <= mid)
            {
                temp[k] = arr[i];
                i++;
                k++;
            }
        }
        for(i = beg; i < k; i++)
        {
             arr[i] = temp[i];
        } 
    }

    public static void main(String args[])
     {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int arr[] = new int[n];
         int i, beg, end, mid;
         for(i = 0; i < n; i++)
         {
             arr[i] = scan.nextInt();
         }
         beg = 0;
         end = n-1;
         merge_sort(arr, 0, n-1);
         for(i = 0; i < n; i++)
         {
             System.out.println(arr[i]);
         }
     }
         
}
