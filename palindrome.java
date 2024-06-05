import java.util.*;
class Palindrome
{
    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n=sc.nextInt();
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
            System.out.println(n1+" Number is not palindromed:
            d");
    }
}