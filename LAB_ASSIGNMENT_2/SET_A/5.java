//5. Write a Java program to calculate factorial of a number using recursion.

import java.util.*;
class Demo
{
    static int fact(int num)
    {
        if(num==1)
            return 1;
        else
            return num*fact(num-1);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        System.out.println("Factorial="+fact(n));
    }
}