import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        int a[]=new int[10];
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        System.out.print("Enter number n numbers:");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.print("Even numbers=");
        for(int i=0;i<n;i++)
        {
            if(a[i]%2==0)
            {
                System.out.print("\t"+a[i]);
            }
        }
    }
}