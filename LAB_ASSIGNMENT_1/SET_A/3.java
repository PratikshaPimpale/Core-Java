//3. Write a java Program to accept employee name from a user and display it in reverse order. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Name:");
        String name=sc.next();
        int l=name.length();
        String rev="";
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=name.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reverse Name="+rev);
    }
}