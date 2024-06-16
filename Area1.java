import java.util.*;
class Area
{
    float a;
    void carea(float r)
    {
        a=3.14f*r*r;
        System.out.println("Area of circle="+a);
    }

    void sarea(int s)
    {
        a=s*s;
        System.out.println("Area of square="+a);
    }

    void rarea(float l, float b)
    {
        a=l*b;
        System.out.println("Area of rectangle="+a);
    }

    public static void main(String arg[])
    {
        Area ob;        //creating object of class
        ob=new Area();  //memory allocating to object
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter radius:");
        float r=sc.nextFloat();
        ob.carea(r);

        System.out.print("Enter side:");
        int s=sc.nextInt();
        ob.sarea(s);

        System.out.print("Enter length & breadth:");
        float l=sc.nextFloat();
        float b=sc.nextFloat();
        ob.rarea(l,b);
    }
}