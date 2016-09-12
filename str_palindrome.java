//To check if a string is PALINDROME or not

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String A = scan.next();
        int i, j;
        int l = A.length();
        boolean flag = true;
        j = l - 1;
        for(i = 0; i < l/2 ; i++)
        {
            if(A.charAt(i) != A.charAt(j))
            {
                flag = false;
                break;
            }
            j--;
        }    
        if(flag == true)
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");    
        }
    }
}
