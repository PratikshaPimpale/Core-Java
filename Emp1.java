import java.util.*;
class Emp
{
    int eno;
    String ename;
    float sal;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Emp no:");
        eno=sc.nextInt();
        System.out.print("Enter Emp name:");
        ename=sc.next();
        System.out.print("Enter Emp salary:");
        sal=sc.nextFloat();
    }

    void disp()
    {
        System.out.println("Emp no="+eno);
        System.out.println("Emp name="+ename);
        System.out.println("Emp salary="+sal);
    }

    public static void main(String arg[])
    {
        Emp ob=new Emp();
        ob.accept();
        ob.disp();
    }
}