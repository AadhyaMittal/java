//To implement BUBBLE SORT in java

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
public class bubble_sort
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        int arr[] = new int[20];
        int i, j, temp;
        for(i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt(); 
        }
        for(i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
        for(i = 0; i < n - 1; i++)
        {
            for(j = 0 ; j < n - i - 1; j++)
            {
                if(arr[j] > arr[j+1])
                {
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
                    
            }
        }
        for(i = 0; i < n; i++)
        {
            System.out.println(arr[i]);
        }
    }
}
