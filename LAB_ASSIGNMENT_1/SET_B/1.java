//1. Write a java program to accept n city names and display them in ascending order.

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        int i;
        String []a=new String[n];
        System.out.print("Enter city names:");
        for(i=0;i<n;i++)
            a[i]=sc.next();

        Arrays.sort(a);         //sort the array

        System.out.print("Cities in Ascending order=");
        for(i=0;i<n;i++)
            System.out.print("  "+a[i]);
    }
}