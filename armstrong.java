import java.util.*;
class Armstrong
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int s=0;
        int n1=n;
        while(n>0)
        {
            int r=n%10;
            s=s+(r*r*r);
            n=n/10;
        }
        if(n1==s)
            System.out.println(n1+" Number is armstrong");
        else
            System.out.println(n1+" Number is not armstrong");
    }
}