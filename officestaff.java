import java.util.*;
class Staff 
{
    int id;
    String name;
    Staff(int id, String name)
    {
        this.id=id;
        this.name=name;
    }
}
class OfficeStaff extends Staff
{
    String dept;
    OfficeStaff(int id, String name, String dept)
    {
        super(id,name);
        this.dept=dept;
    }
    void disp()
    {
        System.out.println("\nStaff id="+id);
        System.out.println("Name="+name);
        System.out.println("Department="+dept);
    }
}
class MD
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter limit:");
        int n=sc.nextInt();
       OfficeStaff ob[]=new OfficeStaff[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("\nEnter id:");
            int id=sc.nextInt();
            System.out.println("Enter name:");
            String name=sc.next();
            System.out.println("Enter department:");
            String dept=sc.next();
            ob[i]=new OfficeStaff(id,name,dept);
        }
        for(int i=0;i<n;i++)
        {
            ob[i].disp();
        }
    }
}