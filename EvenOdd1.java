import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Demo ob=new Demo();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        int n=sc.nextInt();
        if(n%2==0)
            System.out.println("Number is even");
        else
            System.out.println("Number is odd");
    }
}