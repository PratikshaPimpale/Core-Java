//2. Write a java program to display each word in reverse order from a string array. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String:");
        String s1=sc.nextLine();
        String s2[]=s1.split(" ");
        for(int i=0;i<s2.length;i++)
        {
            StringBuffer sbr=new StringBuffer(s2[i]);
            System.out.print(" "+sbr.reverse());
        }
    }
}

//Solve nhi kelay 