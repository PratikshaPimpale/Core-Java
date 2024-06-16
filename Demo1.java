import java.util.*;
class Demo
{
    void factorial(int n)
    {
        int f=1;
        for(int i=1;i<=n;i++)
        {
            f=f*i;
        }
        System.out.println("factorial="+f);
    }

    void armstrong(int n)
    {
        int n1=n,s=0,r=0;
        while(n>0)
        {
            r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(n1==s)
            System.out.println("Number is armstrong");
        else
            System.out.println("Number is not armstrong");
    }

    void prime(int n)
    {
        int f=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==1)
            System.out.println("Number is not prime");
        else
            System.out.println("Number is prime");
    }

    void perfect(int n)
    {
        int s=0;
        for(int i=1;i<n;i++)
        {
            if(n%i==0)
            {
                s=s+i;
            }
        }
        if(s==n)
            System.out.println("Number is perfect");
        else
            System.out.println("Number is not perfect");

    }

    void palindrome(int n)
    {
        int r=0;
        int n1=n;
        while(n>0)
        {
            int d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        if(n1==r)
            System.out.println(n1+" Number is palindrome");
        else
            System.out.println(n1+" Number is not palindrome");
    }

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter number for finding factorial:");
        int n1=sc.nextInt();
        ob.factorial(n1);

        System.out.print("Enter number to check prime:");
        int n2=sc.nextInt();
        ob.prime(n2);

        System.out.print("Enter number to check armstrong or not:");
        int n3=sc.nextInt();
        ob.armstrong(n3);

        System.out.print("Enter number to check perfect or not:");
        int n4=sc.nextInt();
        ob.perfect(n4);

        System.out.print("Enter number to check palindrome or not:");
        int n5=sc.nextInt();
        ob.palindrome(n5);
    }
}