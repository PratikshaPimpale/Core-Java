//2. Write a java Program to display all the perfect numbers between 1 to n.

import java.util.*;
class Show
{
    boolean perfect(int num)
    {
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
                sum=sum+i;
        }
        if(sum==num)
            return true;
        else
            return false;
    }
}
class Demo
{
    public static void main(String arg[])
    {
        Show ob=new Show();
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        System.out.print("Perfect numbers from 1 to n:");
        for(int i=1;i<=n;i++)
        {
            if(ob.perfect(i))
                System.out.print("  "+i);
        }
    }
}