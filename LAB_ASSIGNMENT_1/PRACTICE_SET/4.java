//4. Write a Java program to display Fibonacci series. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        int a=0,b=1,c=1;
        System.out.print("Fibonacci series=  ");
        for(int i=0;i<n;i++)
        {
            System.out.print(c+"\t");
            c=a+b;
            a=b;
            b=c;
        }
    }
}