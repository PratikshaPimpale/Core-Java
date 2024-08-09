/*5. Create a package named Series having three different classes to print series: 
i. Fibonacci series 
ii. Cube of numbers
iii. Square of numbers 
Write a java program to generate ‘n’ terms of the above series.*/

/*D:series/Fibonacci.java
package series;
public class Fibonacci
{
    public void fib(int n)
    {
        int a=0,b=1,c;
        System.out.print("Fibonacci series= "+a+" "+b);
        for(int i=0;i<n;i++)
        {
            c=a+b;
            System.out.print(" "+c);
        }
    }
}*/

/*D:series/Square.java
package series;
public class Square
{
    public void square(int n)
    {
        System.out.print("Square="+(n*n));
    }
}*/

/*D:series/Cube.java
package series;
public class Cube
{
    public void cube(int n)
    {
        System.out.print("Cube="+(n*n*n));
    }
}*/

import series.*;
class MD
{
    public static void main(String arg[])
    {
        Fibonacci ob1=new Fibonacci();
        ob1.fib(10);

        Square ob2=new Square();
        ob2.square(5);

        Cube ob3=new Cube();
        ob3.cube(5);
    }
}