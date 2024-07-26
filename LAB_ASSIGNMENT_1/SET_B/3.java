//3. Write a java program to search given name into the array, if it is found then display its index 
//otherwise display appropriate message.

import java.util.*;
class Demo
{
    static void find(String a[], String name, int n)
    {
        int f=0,i;
        for(i=0;i<n;i++)
        {
            if(a[i].equals(name))
            {
                f=1;
                break;
            }        
        }
        if(f==1)
            System.out.println("Name fount index position="+i);
        else
            System.out.println("Name not found");
    }

    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        String a[]=new String[n];
        System.out.print("Enter n names:");
        for(int i=0;i<n;i++)
            a[i]=sc.next();
        System.out.print("Enter name to search:");
        String name=sc.next();
        find(a,name,n);
    }
}