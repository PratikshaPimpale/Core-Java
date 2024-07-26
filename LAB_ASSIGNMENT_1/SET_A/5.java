//5. Write a java program to display the vowels from a given string.

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String str=sc.next();
        char ch;
        System.out.print("Vowels=");
        for(int i=0;i<str.length();i++)
        {
            ch=str.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U')
                System.out.print(ch);
        }
    }
}