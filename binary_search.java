//To implement BINARY SEARCH using java

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
public class binary_search 
{
     public static void main(String[] args)
     {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         System.out.println(n);
         int beg, mid, end;
         int num = scan.nextInt();
         int[] arr = new int[n];
         beg = 0;
         end = n - 1;
         for(int i = 0; i < n; i++)
         {
             arr[i] = scan.nextInt();
         }
         boolean flag = false;
         while(beg < end)
         {
             mid = (beg + end)/2;
             if(mid == num)
             {
                 System.out.print("Number found at " + mid);
                 flag = true;
                 break;
             }
             else if (num < mid)
             {
                 end = mid - 1;
             }
             else if (num > mid)
             {
                 beg = mid + 1;
             }
        }
         if(flag == false)
         {
             System.out.println("Number not found");
         }
     }       
}
