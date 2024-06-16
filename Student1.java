import java.util.*;
class Student
{
    int rno,m1,m2,m3,m4,m5,m6,t=0;
    String name;
    float per;

    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter student roll no:");
        rno=sc.nextInt();
        System.out.print("Enter student name:");
        name=sc.next();
        System.out.print("Enter student 6 subject marks:");
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        m4=sc.nextInt();
        m5=sc.nextInt();
        m6=sc.nextInt();
    }

    void cal()
    {
        t=m1+m2+m3+m4+m5+m6;
        per=t/6;
    }

    void disp()
    {
        cal();
        System.out.println("Roll no="+rno);
        System.out.println("Name="+name);
        System.out.println("Total="+t);
        System.out.println("Percentage="+per);
    }

    public static void main(String arg[])
    {
        Student ob=new Student();
        ob.accept();
        ob.disp();
    }
}