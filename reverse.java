import java.util.*;
class Reverse
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
        int r=0;
        while(n>0)
        {
            int d=n%10;
            r=(r*10)+d;
            n=n/10;
        }
        
        System.out.println("Reverse="+r);
    }
}