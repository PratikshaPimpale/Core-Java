//10. Write a java program to calculate the sum of even numbers from an array

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        int a[]=new int[n];

        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }

        System.out.print("Even numbers=");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
                System.out.print("  "+a[i]);
        }
    }
}