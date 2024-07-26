//Write a java Program to check whether given String is Palindrome or not.

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        int l=str.length();
        String rev="";
        char ch;
        for(int i=0;i<l;i++)
        {
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println("Reverse String="+rev);
    }
}