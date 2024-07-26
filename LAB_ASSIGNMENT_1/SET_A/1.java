//1. Write a java Program to check whether given number is Prime or Not. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.print(n+" is prime number");
        else
            System.out.print(n+" is not prime number");
    }
}