
package com.iseven;
import java.util.Scanner;

public class IsEven
{
    public static void main(String[] args)
    {
        int input;
       Scanner sc =  new Scanner(System.in);
       System.out.println("Enter an integer: ");
       input = sc.nextInt();
       if(input % 2 == 0)
       {
           System.out.println("The number " + input + " is even.");
       }
       else
       {
           System.out.println("The number " + input + " is Odd.");
       }
    }
}
