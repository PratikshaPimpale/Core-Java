//3. Define a class Student(rollno,name,per). Create n objects of the student class and Display 
//it using toString().(Use parameterized constructor) 

import java.util.*;
class Student
{
    int rno;
    String name;
    float per;
    Student(int rno, String name, float per)
    {
        this.rno=rno;
        this.name=name;
        this.per=per;
    }
    void disp()
    {
        System.out.println("\nStudent roll no="+rno);
        System.out.println("Name="+name);
        System.out.println("Percentage="+per);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Student ob[]=new Student[n];

        for(int i=0;i<n;i++)
        {
            System.out.print("Enter rno,name,percentage:");
            int rno=sc.nextInt();
            String name=sc.next();
            float per=sc.nextFloat();
            ob[i]=new Student(rno,name,per);
        }

        for(int i=0;i<n;i++)
            ob[i].disp(); 
    }
}