import java.util.*;
abstract class Staff
{
  String name,add;
  abstract void disp();
}

class FullTime extends Staff
{
 String dept;
 float sal; 
 FullTime(String name,String add,String dept, float sal)
 {
   this.name=name;
   this.add=add;
   this.dept=dept;
   this.sal=sal;
 }
 void disp()
 {
   System.out.println("Staff name="+name);
   System.out.println("Staff address="+add);
   System.out.println("Staff dept="+dept);
   System.out.println("Staff salary="+sal);
 }
}

class PartTime extends Staff
{
 int no_of_hours;
 float rate,payhour;
 PartTime( String name,String add,int no_of_hours, float rate, float payhour)
 {
   this.name=name;
   this.add=add;
   this.no_of_hours=no_of_hours;
   this.rate=rate;
   this.payhour=payhour;
 }
  void disp()
 {
   System.out.println("Staff name="+name);
   System.out.println("Staff address="+add);
   System.out.println("no of hours:"+no_of_hours);
   System.out.println("Rate="+rate);
   System.out.println("Pay hour="+payhour);
 }
}

class MD
{
  public static void main(String arg[])
  {
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter limit:");
   int n=sc.nextInt();

   FullTime ob1[]=new FullTime[n];
   PartTime ob2[]=new PartTime[n]; 
    int ch,i;
   do{
    System.out.print("1-fulltime \n2-parttime \nEnter choice:");
    ch=sc.nextInt();
    switch(ch)
    {
        case 1: for(i=0;i<n;i++)
                    {
                       System.out.print("\nEnter name,address,department,salary:");
                       String name=sc.next();
                       String add=sc.next();
                       String dept=sc.next();
                       float sal=sc.nextFloat();
                       ob1[i]=new FullTime(name,add,dept,sal);
                    }
                    for(i=0;i<n;i++)
                    {
                       ob1[i].disp();
                    }
                    break;
         case 2: for(i=0;i<n;i++)
                    {
                       System.out.print("\nEnter name, address, no of hours, rate, payrate:");
                       String name=sc.next();
                       String add=sc.next();
                       int no_of_hours=sc.nextInt();
                       float rate=sc.nextFloat();
                       float payrate=sc.nextFloat();
                        ob2[i]=new PartTime(name,add,no_of_hours,rate,payrate);
                    }
                    for(i=0;i<n;i++)
                    {
                       ob2[i].disp();
                    }
                    break;
    }
   }while(ch<3);
  }
}
