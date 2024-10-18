/*B) Create a package TYBBACA with two classes as class Student (Rno, SName, Per) with a method 
disp() to display details of N Students and class Teacher (TID, TName, Subject) with a method 
disp() to display the details of teacher who is teaching Java subject. (Make use of finalize() 
method and array of Object) */
/*D:tybbaca/Student.java
package tybbaca;
public class Student
{
    int rno;
    String sname;
    float per;
    public Student(int rno,String sname,float per)
    {
        this.rno=rno;
        this.sname=sname;
        this.per=per;
    }
    public void disp()
    {
        System.out.println("\nStudent rno="+rno);
        System.out.println("Name="+sname);
        System.out.println("Percentage="+per);
    }
}*/

/*D:tybbaca/Teacher.java
package tybbaca;
public class Teacher
{
    int tid;
    String tname,sub;
    public Teacher(int tid,String tname,String sub)
    {
        this.tid=tid;
        this.tname=tname;
        this.sub=sub;
    }
    public void disp()
    {
        if(sub.equals("java"))
        {
            System.out.println("\nTeacher id="+tid);
            System.out.println("Name="+tname);
            System.out.println("Subject="+sub);
        }
    }
}*/

import java.util.*;
import tybbaca.*;
class MD
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();

        Student ob[]=new Student[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("ENter student rno, name, per:");
            int rno=sc.nextInt();
            String sname=sc.next();
            float per=sc.nextFloat();
            ob[i]=new Student(rno,sname,per);
        }

        Teacher ob1[]=new Teacher[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("ENter teacher id, name, sub:");
            int tid=sc.nextInt();
            String tname=sc.next();
            String sub=sc.next();
            ob1[i]=new Teacher(tid,tname,sub);
        }

        System.out.println("Student info:");
        for(int i=0;i<n;i++)
            ob[i].disp();

        System.out.println("\nTeacher info:");
        for(int i=0;i<n;i++)
            ob1[i].disp();
    }
}
