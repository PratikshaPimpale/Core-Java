/*1. Define class Student(rno, name, mark1, mark2). Define Result class(total, percentage) 
inside the student class. Accept the student details & display the mark sheet with rno, 
name, mark1, mark2, total, percentage. (Use inner class concept) */

import java.util.*;
class Student
{
    int rno,m1,m2;
    String name;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Student rno, name, 2subject's marks:");
        rno=sc.nextInt();
        name=sc.next();
        m1=sc.nextInt();
        m2=sc.nextInt();
    }
}
class Result extends Student
{
    int t;
    float per;
    void cal()
    {
        t=m1+m2;
        per=t/2;
    }
    void disp()
    {
        System.out.println("\nStudent roll no="+rno);
        System.out.println("Name="+name);
        System.out.println("Total marks="+t);
        System.out.println("Percentage="+per);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Result ob=new Result();
        ob.accept();
        ob.cal();
        ob.disp();
    }
}