//4. Write a java program to display all the even numbers from an array. 
//(Use Command Line arguments)

class Demo
{
    public static void main(String arg[])
    {
        System.out.print("Even numbers=");
        for(int i=0;i<arg.length;i++)
        {
            int n=Integer.parseInt(arg[i]);
            if(n%2==0)
                System.out.print("  "+n);
        }
    }
}