//to print the datatype of a given number

import java.util.*;
import java.io.*;



class Solution
{
    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x = scan.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x >= -(Math.pow(2,7)) && x <= (Math.pow(2,7)-1))
                {    
                    System.out.println("* byte");
                }
                if(x >= -(Math.pow(2,15)) && x <= (Math.pow(2,15)-1))
                {    
                    System.out.println("* short");
                }
                if(x >= -(Math.pow(2,31)) && x <= (Math.pow(2,31)-1))
                {    
                    System.out.println("* int");
                }
                if(x >= -(Math.pow(2,63)) && x <= (Math.pow(2,63)-1))
                {    
                    System.out.println("* long");
                }
                //Complete the code
            }
            catch(Exception e)
            {
                System.out.println(scan.next()+" can't be fitted anywhere.");
            }

        }
    }
}
