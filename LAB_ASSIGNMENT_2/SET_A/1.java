//1. Write a Java program to calculate power of a number using recursion. 

class Demo
{
    int power(int x, int y)
    {
        if(y==0)
            return 1;
        else
            return x*power(x,y-1);
    }

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        System.out.print("Base to power="+ob.power(2,5));
    }
}