import java.util.*;
class Demo
{
    void area(float r)
    {
        float a=3.14f*r*r;
        System.out.println("Area of circle="+a);
    }
    
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Demo ob =new Demo();
        System.out.println("Enter radius:");
        float r=sc.nextFloat();
        ob.area(r);
    }
}