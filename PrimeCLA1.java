class PrimeDemo
{
    public static void main(String arg[])
    {
        System.out.print("Prime numbers=");
        for(int i=0; i<arg.length; i++)
        {
 			int n=Integer.parseInt(arg[i]);
			int s=0;
			for(int j=2; j<n; j++)
			{
	  	 		if(n%j==0)
	   			{
	      			s=s+1;
	   			}
			}
			if(s==0)
	  			System.out.print(n+"  ");
        }
    }
}