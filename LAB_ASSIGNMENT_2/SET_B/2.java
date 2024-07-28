/*2. Define a class product(pid,pname,price). Write a function to accept the product details, to 
display product details and to calculate total amount. (use array of Objects)*/

import java.util.*;
class Product
{
    int pid,qty;
    String pname;
    float price,total;
    Scanner sc=new Scanner(System.in);
    void accept()
    {
        System.out.print("Enter product id, name, price, quantity:");
        pid=sc.nextInt();
        pname=sc.next();
        price=sc.nextFloat();
        qty=sc.nextInt();
    }
    void disp()
    {
        System.out.println("\nProduct id="+pid);
        System.out.println("Name="+pname);
        System.out.println("Price="+price);
        System.out.println("Quantity="+qty);
        System.out.println("Total bill="+(qty*price));
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Product ob[]=new Product[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Product();
            ob[i].accept();
        }
        for(int i=0;i<n;i++)
            ob[i].disp();
    }
}