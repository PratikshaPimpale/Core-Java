//5. Write a java program to display alternate character from a given string. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string:");
        String s1=sc.nextLine();
        System.out.print("Alternate characters=:");
        for(int i=0;i<s1.length();i=i+2)
        {
            System.out.print(s1.charAt(i));
        }
    }
}