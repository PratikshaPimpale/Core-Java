//2. Write a java program to accept n numbers from a user store only Armstrong numbers in an array 
//and display it. 

import java.util.*;
class Show
{
    boolean isarmstrong(int n)
    {
        int n1=n,s=0,r=0;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(s==n1)
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
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        int i,j=0;
        System.out.print("Enter n numbers:");
        for(i=0;i<n;i++)
            a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(ob.isarmstrong(a[i]))
            {
                b[j]=a[i];
                j++;
            }
        }
        System.out.print("Armstrong numbers:");
        int l=b.length;
        for(i=0;i<l;i++)
        {
            if(b[i]=='\0')
                break;
           System.out.print("  "+b[i]);
        }
    }
}