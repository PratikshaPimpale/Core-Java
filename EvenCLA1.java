class EvenDemo
{
    public static void main(String arg[])
    {
          System.out.print("Even numbers=");
          for(int i=0; i<arg.length; i++)
          {
 	int n=Integer.parseInt(arg[i]);
	if(n%2==0)
	   System.out.print(n+"   ");
          }
    }
}