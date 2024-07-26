// 3. Write a Java program to accept a number from command prompt and generate 
//multiplication table of a number. 

class Demo
{
    public static void main(String arg[])
    {
        int n=Integer.parseInt(arg[0]);
        System.out.println("Table of "+n);
        for(int i=1;i<=10;i++)
        {
            System.out.println(n*i);
        }
    }
}
