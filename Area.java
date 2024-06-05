import java.util.*;
class Cylinder
{
    Scanner sc=new Scanner(System.in);
    float r,h,a;
    void area()
    {
        System.out.print("\nEnter radius and height:");
        r=sc.nextFloat();
        h=sc.nextFloat();
        a=2*3.14f*r*h+2*3.14f*r*r;
        System.out.println("\nArea f cylinder="+a);
    }
}

class Circle extends Cylinder
{
    void area()
    {
        System.out.print("\nEnter radius :");
        r=sc.nextFloat();
        a=3.14f*r*r;
        System.out.println("\nArea f circle="+a);
        super.area();
    }
}

class Area
{
    public static void main(String arg[])
    {
        Circle ob=new Circle();
        ob.area();
    }
}