//4. Write a Java program to Copy data of one object to another Object.

class Addition
{
    int a=10, b=20;
    int c=a+b;
}

class Demo
{
    public static void main(String arg[])
    {
        Addition ob1=new Addition();
        System.out.println("\nPrinting orginal object values:");
        System.out.println("a="+ob1.a+" b="+ob1.b+"\nAddition="+ob1.c);

        Addition ob2=new Addition();
        ob2=ob1;
        System.out.println("\nPrinting copied object values:");
        System.out.println("a="+ob2.a+" b="+ob2.b+"\nAddition="+ob2.c);
    }
}