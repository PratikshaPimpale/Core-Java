//5. Write a Java program to for the implementation of this keyword.

class Add
{
    int a,b,c;
    Add(int a, int b)
    {
        this.a=a;
        this.b=b;
    }
    void add()
    {
        c=a+b;
        System.out.println("Addition="+c);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Add ob=new Add(10,15);
        ob.add();
    }
}