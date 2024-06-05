import java.util.*;
class Employee
{
    int id,sal;
    String name,dept;
    Scanner sc=new Scanner(System.in);
    Employee()
    {
        id=101;
        name="Pratiksha";
        dept="Comp";
        sal=sal;
    }
    Employee(int id,String name,String dept,int sal)
    {
        this.id=101;
        this.name="Pratiksha";
        this.dept="Comp";
        this.sal=sal;
    }
    void accept()
    {
        System.out.print("\nEnter emp id name dept salary:");
        id=sc.nextInt();
        name=sc.next();
        dept=sc.next();
        sal=sc.nextInt();
    }
    void disp()
    {
        System.out.println("\nEmp id="+id);
        System.out.println("Name="+name);
        System.out.println("Department="+dept);
        System.out.println("Salary="+sal);
    }
}

class Manager extends Employee
{
    int bonus;
    Manager()
    {
        bonus=2000;
    }
    Manager(int bonus)
    {
        this.bonus=bonus;
    }
    void acceptm()
    {
        System.out.print("\nEnter bonus:");
        bonus=sc.nextInt();
    }
    void dispm()
    {
        System.out.println("Bonus="+bonus);
    }
}

class MD
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Manager ob[]=new Manager[n];
        for(int i=0;i<n;i++)
        {
            ob[i]=new Manager();
            ob[i].accept();
            ob[i].acceptm();
        }
        int index=0;
        int max=ob[0].sal+ob[0].bonus;
        for(int i=1;i<n;i++)
        {
            if((ob[i].sal+ob[i].bonus)>max)
            {
                max=ob[i].sal+ob[i].bonus;
                index=i;
            }
        }
        ob[index].disp();
        ob[index].dispm();
    }
}