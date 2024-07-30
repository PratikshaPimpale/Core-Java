//4. Write a Java program to calculate sum of digits of a number using Recursion. 

import java.util.*;
class Demo
{
    int sum(int num)
    {
        if(num==0)
            return 0;
        else
            return num%10+sum(num/10);
    }

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int num=sc.nextInt();
        System.out.println("Sum of digit="+ob.sum(num));
    }
}