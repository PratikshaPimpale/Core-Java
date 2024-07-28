//4. Write a java program to accept details of  ‘n’  books. And Display the quantity of given book.

import java.util.*;
class Book 
{
    int bid,qty;
    String bname;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter book id name, quantity:");
        bid=sc.nextInt();
        bname=sc.next();
        qty=sc.nextInt();
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Book ob[]=new Book[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Book();
            ob[i].accept();
        }
        System.out.print("Enter book name:");
        String name=sc.next();
        for(int i=0;i<n;i++)
        {
            if(name.equals(ob[i].bname))
            {
                System.out.println("Book quantity="+ob[i].qty);
                break;
            }
            else
            {
                System.out.println("Book not found");
            }
        }
    }
}