import java.util.*;
class Demo
{
    void volume(float r, float h)
    {
        float v=3.14f*r*r*h;
        System.out.println("Volume of cylinder="+v);
    }

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

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        int ch;
        do{
            System.out.println("\n1-volume of cylinder \n2-factorial of number \n3-check armstrong or not \n4-Exit \nEnter choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Enter radius & height:");
                        float r=sc.nextFloat();
                        float h=sc.nextFloat();
                        ob.volume(r,h);
                        break;
                case 2:System.out.println("Enter number:");
                        int n=sc.nextInt();
                        ob.factorial(n);
                        break;
                case 3:System.out.println("Enter number:");
                        n=sc.nextInt();
                        ob.armstrong(n);
                        break;
                case 4:System.exit(0);
                        break;
                default:System.out.println("Case not match");
            }
        }while(ch<5);
    }
}