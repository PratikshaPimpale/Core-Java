import java.util.*;
abstract class Order
{
  Scanner sc=new Scanner(System.in);
  int id;
  String description;
  abstract void accept();
  abstract void disp();
}
class PurchaseOrder extends Order
{
  String cname;
  void accept()
 {
   System.out.print("\nEnter order id:");
   id=sc.nextInt();
   System.out.print("Enter order description:");
   description=sc.next();
   System.out.print("Enter customer name:");
   cname=sc.next();
 }
  void disp()
 {
   System.out.println("\norder id:"+id);
   System.out.println("order description:"+description);
   System.out.println("customer name:"+cname);
 }
}
class SalesOrder extends Order
{
  String vname;
  void accept()
 {
   System.out.print("\nd:Enter order id:");
   id=sc.nextInt();
   System.out.print("Enter order description:");
   description=sc.next();
   System.out.print("Enter vendor name:");
   vname=sc.next();
 }
  void disp()
 {
   System.out.println("\norder id:"+id);
   System.out.println("order description:"+description);
   System.out.println("vendor name:"+vname);
 }
}
class MD
{
  public static void main(String arg[])
  {
     PurchaseOrder ob1=new PurchaseOrder();
     PurchaseOrder ob2=new PurchaseOrder();
     PurchaseOrder ob3=new PurchaseOrder();
     ob1.accept();
     ob2.accept();
     ob3.accept();
     ob1.disp();
     ob2.disp();
     ob3.disp();

     SalesOrder ob4=new SalesOrder();
     SalesOrder ob5=new SalesOrder();
     SalesOrder ob6=new SalesOrder();
     ob4.accept();
     ob5.accept();
     ob6.accept();

     ob4.disp();
     ob5.disp();
     ob6.disp();
  }
}