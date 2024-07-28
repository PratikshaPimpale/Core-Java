/*4. Define a class MyNumber having one private integer data member. Write a default 
constructor to initialize it to 0 and another constructor to initialize it to a value. Write 
methods isNegative, isPositive. Use command line argument to pass a value to the object 
and perform the above tests. */

class MyNumber
{
    private int n;
    MyNumber()
    {
        n=0;
    }
    MyNumber(int n)
    {
        this.n=n;
    }
    boolean isZero()
    {
        if(n==0)
            return true;
        else
            return false;
    }
    boolean isNegative()
    {
        if(n<0)
            return true;
        else
            return false;
    }
    boolean isPositive()
    {
        if(n>0)
            return true;
        else
            return false;
    }
}

class Demo
{
    public static void main(String arg[])
    {
        MyNumber ob=new MyNumber();
        if(ob.isZero())
            System.out.println("Number is zero");
        if(ob.isNegative())
            System.out.println("Number is Negative");
        if(ob.isPositive())
            System.out.println("Number is Positive");

        int n=Integer.parseInt(arg[0]);
        MyNumber ob1=new MyNumber(n);
        if(ob1.isZero())
            System.out.println("Number is zero");
        if(ob1.isNegative())
            System.out.println("Number is Negative");
        if(ob1.isPositive())
            System.out.println("Number is Positive"); 
    }
}