import java.util.*;
class Product
{
    int pno,qty;
    String pname;
    float t,price;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter product no:");
        pno=sc.nextInt();
        System.out.print("Enter product name:");
        pname=sc.next();
        System.out.print("Enter product quantity:");
        qty=sc.nextInt();
        System.out.print("Enter price:");
        price=sc.nextFloat();

    }

    void cal()
    {
        t=qty*price;
    }

    void disp()
    {
        System.out.println("\nProduct no="+pno);
        System.out.println("Product Name="+pname);
        System.out.println("Quantity="+qty);
        System.out.println("Total bill="+t);
    }

    public static void main(String arg[])
    {
        Product ob=new Product();
        ob.accept();
        ob.cal();
        ob.disp();
    }
}