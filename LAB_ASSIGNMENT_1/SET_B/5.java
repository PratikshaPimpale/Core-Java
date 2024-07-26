/*5. Write a java program to display following pattern: 
1  
0 1 
0 1 0 
1 0 1 0 */

class Demo
{
    public static void main(String arg[])
    {
        int k=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(" "+(k%2));
                k++;
            }
            System.out.println();
        }
    }
}