/*5. Create a package Mathematics with two classes Maximum and Power. Write a java 
program to accept two numbers from user and perform the following operations on it: 
a. Find Maximum of two numbers. 
b. Calculate the power(XY); */

/*D:mathematics/Maximum.java
package mathematics;
public class Maximum
{
    public void max(int a,int b)
    {
        if(a>b)
            System.out.println("Maximum="+a);
        else
            System.out.println("Maximum="+b);
    }
}*/

/*D:mathematics/Power.java
package mathematics;
public class Power
{
    int p=0;
    public void pow(int x,int y)
    {
        for(int i=0;i<=y;i++)
        {
           p=x*x; 
        }
        System.out.println("Power="+p);
    }
}*/

import mathematics.*;
class MD
{
    public static void main(String arg[])
    {
        Maximum ob1=new Maximum();
        ob1.max(10,20);
        Power ob2=new Power();
        ob2.pow(5,3);
    }
}
