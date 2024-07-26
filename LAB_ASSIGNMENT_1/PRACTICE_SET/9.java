//9. Write a java Program to calculate the sum of first and last digit of a number.

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 3 digit number:");
        int n=sc.nextInt();

        int a=n%10;
        int sum=0,rev=0,rem=0;
        while(n>0)
        {
            rem=n%10;
            rev=rem+(rev*10);
            n=n/10;
        }
        int b=rev%10;
        sum=a+b;
        System.out.println("Sum of first & last digit="+sum);
    }
}