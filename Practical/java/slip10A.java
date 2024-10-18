/*A) Write a java program to accept a number from user, if it zero then throw user defined Exception 
“Number Is Zero”, otherwise calculate the sum of first and last digit of that number. (Use static 
keyword).*/
import java.util.*;
class NumberIsZeroException extends Exception
{
    public String toString()
    {
        return "Number is zero error";
    }
}

class PalDemo
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter number:");
            int n=sc.nextInt();
            if(n==0)
                throw new NumberIsZeroException();
            int n1=n;
            int r=0;
            while(n>0)
            {
                int d=n%10;
                r=(r*10)+d;
                n=n/10;
            }
            if(r==n1)
                System.out.println("Number is palindrome");
            else
                System.out.println("Number is not palindrome");
        }catch(NumberIsZeroException e)
        {
            System.out.println(e);
        }
        catch(Exception e1)
        {
            System.out.println("Number is invalid");
        }
    }
}
