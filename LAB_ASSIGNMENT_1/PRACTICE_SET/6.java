//6. Write a Java program to accept a year and check if it is leap year or not. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter year:");
        int y=sc.nextInt();
        if(y%4==0)
            System.out.print(y+" is laep year");
        else
            System.out.print(y+" is not laep year");
    }
}