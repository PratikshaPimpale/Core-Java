//3. Write a Java program to calculate area of Circle, Triangle & Rectangle.(Use Method Overloading) 

class Area
{
    float a;
    void area(float r)
    {
        a=(3.14f)*r*r;
        System.out.println("\nArea of circle="+a);
    }
    void area(float b, float h)
    {
        a=(0.5f)*b*h;
        System.out.println("\nArea of triangle="+a);
    }
    void area(int l, int b)
    {
        a=l*b;
        System.out.println("\nArea of rectangle="+a);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Area ob=new Area();
        ob.area(12, 10);        //rect
        ob.area(5.5f);          //circle
        ob.area(4.5f, 3.2f);    //triangle
    }
}