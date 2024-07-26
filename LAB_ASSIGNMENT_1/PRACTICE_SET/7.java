//7. Write a Java program to display characters from A to Z using loop

class Demo
{
    public static void main(String arg[])
    {
        System.out.print("A to Z characters:");
        for(char i='A'; i>='A' && i<='Z'; i++)
        {
            System.out.print("  "+i);
        }
    }
}