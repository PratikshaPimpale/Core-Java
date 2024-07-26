//3. Write a java program for union of two integer array. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit of 1st array:");
        int n1=sc.nextInt();
        System.out.print("Enter limit of 2nd array:");
        int n2=sc.nextInt();
        int a[]=new int[n1];
        int b[]=new int[n2];
        int i;
        System.out.print("Enter 1st array values:");
        for(i=0;i<n1;i++)
            a[i]=sc.nextInt();
        System.out.print("Enter 2nd array values:");
        for(i=0;i<n2;i++)
            b[i]=sc.nextInt();
        
        System.out.print("Union of array=");
        for(i=0;i<n1;i++)
            System.out.print(" "+a[i]);
        for(i=0;i<n2;i++)
            System.out.print(" "+b[i]);
    }
}