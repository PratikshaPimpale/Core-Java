class Demo
{
    float c;
    void add(int a, int b)
    {
        c=a+b;
        System.out.println("\nAddition="+c);
    }

    void add(int a, float b)
    {
        c=a+b;
        System.out.println("\nAddition="+c);
    }

    void add(float a, float b)
    {
        c=a+b;
        System.out.println("\nAddition="+c);
    }

    public static void main(String arg[])
    {
        Demo ob=new Demo();
        ob.add(12,22);  //integer
        ob.add(10,20.5f);   //int,float
        ob.add(11.22f, 44.32f); //float
    }
}