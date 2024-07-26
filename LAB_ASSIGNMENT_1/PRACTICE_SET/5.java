//5. Write a Java program to calculate sum of digits of a number.

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum of digits of number="+sum);
    }
}