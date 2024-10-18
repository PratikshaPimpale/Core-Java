//A) Write a java program to check whether given candidate is eligible for voting or not. Handle user 
//defined as well as system defined Exception.
import java.util.*;
class VotingException extends Exception
{
    public String toString()
    {
        return "Candidate not eligible for vote";
    }
}

class VoteDemo
{
    public static void main(String arg[])
    {
        try
        {
            Scanner sc=new Scanner(System.in);
            System.out.print("Enter age:");
            int age=sc.nextInt();
            if(age<18)
                throw new VotingException();
            System.out.println("You can vote age="+age);
        }catch(VotingException e)
        {
            System.out.println("User error="+e);
        }
        catch(Exception e1)
        {
            System.out.println("System error="+e1);
        }
    }
}
