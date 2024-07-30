//3. Write a Java program to convert integer primitive data. (use toString())

class Demo
{
    public static void main(String arg[])
    {
        int a=10;
        Integer ob=new Integer(a);
        String s1=ob.toString();
        System.out.print("Value converted in string="+s1);
    }
}