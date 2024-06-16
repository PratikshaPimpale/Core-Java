class Demo
{
    double v;
    void volume(float r, float h)
    {
        v=3.14f*r*r*(h/3);
        System.out.println("\nVolume of cone="+v);
    }

    void volume(float r, double h)
    {
        v=3.14f*r*r*h;
        System.out.println("\nVolume of cylinder="+v);
    }

    void volume(int r)
    {
        v=(4/3)*3.14f*r*r*r;
        System.out.println("\nVolume of sphere="+v);
    }
    public static void main(String arg[])
    {
        Demo ob=new Demo();
        ob.volume(3.2f,5.4f);   //cone
        ob.volume(3);           //sphere
        ob.volume(3.4f,8.5);    //cylinder
        ob.volume(5);           //sphere
    }
}