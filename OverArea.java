class Demo
{
    float a;
    void area(float r)
    {
        a=3.14f*r*r;
        System.out.println("\nArea of circle="+a);
    }

    void area(float b, float h)
    {
        a=0.5f*b*h;
        System.out.println("\nArea of triagnle="+a);
    }

    void area(int l, int b)
    {
        a=l*b;
        System.out.println("\nArea of rectangle="+a);
    }

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        ob.area(3.12f); //circle
        ob.area(9,4);   //rect
        ob.area(5.5f);  //circle
        ob.area(7,5);   //rect
        ob.area(1.2f,3.5f); //triangle
    }
}