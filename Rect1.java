import java.util.*;
class Demo
{
    void area(float l, float b)
    {
        float a=l*b;
        System.out.println("Area of rectangle="+a);
    }

    void perimeter(float l, float b)
    {
        float p=2*(l+b);
        System.out.println("Perimeter of rectangle="+p);
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Demo ob= new Demo();
        System.out.print("Enter length & breadth:");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        ob.area(l,b);
        ob.perimeter(l,b);
    }
}