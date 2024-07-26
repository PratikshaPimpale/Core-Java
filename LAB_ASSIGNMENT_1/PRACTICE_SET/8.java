//8. Write a Java program to accept two numbers using command line argument and calculate 
//addition, subtraction, multiplication and division.

class Demo
{
    public static void main(String arg[])
    {
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);

        System.out.println("Addition="+(a+b));
        System.out.println("Substraction="+(a-b));
        System.out.println("Multiplication="+(a*b));
        System.out.println("Division="+(a/b));
    }
}