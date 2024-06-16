import java.util.*;
class Emp
{
    int eno;
    String ename;
    float sal;
    void accept(int eno,String ename,Float sal)
    {
        this.eno=eno;
        this.ename=ename;
        this.sal=sal;
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
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Emp no:");
        int eno=sc.nextInt();
        System.out.print("Enter Emp name:");
        String ename=sc.next();
        System.out.print("Enter Emp salary:");
        float sal=sc.nextFloat();
        ob.accept(eno,ename,sal);
        ob.disp();
    }
}