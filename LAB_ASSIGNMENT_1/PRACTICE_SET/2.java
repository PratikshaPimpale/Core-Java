//2. Write a Java program which accepts three integer values and prints the maximum and minimum.

import java.util.*;
class Show
{
    int max(int a,int b,int c)
    {
        if(a>b && a>c)
            return a;
        else if(b>a && b>c)
            return b;
        else 
            return c;
    }
    int min(int a,int b,int c)
    {
        if(a<b && a<c)
            return a;
        else if(b<a && b<c)
            return b;
        else 
            return c;
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Show ob=new Show();
        int a,b,c;
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter 3 integer numbers:");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        System.out.println("Maximum number="+ob.max(a,b,c));
        System.out.println("Minimum number="+ob.min(a,b,c));
    }
}