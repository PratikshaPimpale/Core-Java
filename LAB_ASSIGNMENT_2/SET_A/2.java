//2. Write a Java program to display Fibonacci series using function. 

import java.util.*;
class Fibonacci
{
    static void fib(int n)
    {
        int a=0;
        int b=1;
        int c;
        System.out.print("Fibbonacci Series= "+a+" "+b);
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
            a=b;
            b=c;
        }
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        fib(n);
    }
}