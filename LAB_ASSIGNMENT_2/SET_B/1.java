/*1. Define a class person(pid,pname,age,gender). Define Default and parameterised     
constructor. Overload the constructor. Accept the 5 person details and display it.(use this 
keyword). */

class Person
{
    int pid,age;
    String name,gender;
    Person()
    {
        System.out.println("I am default constructor of Person class...");
    }
    Person(int pid, String name, int age, String gender)
    {
        this.pid=pid;
        this.age=age;
        this.name=name;
        this.gender=gender;
        System.out.println("\nPerson id="+pid);
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Gender="+gender);
    }
}

class Demo
{
    public static void main(String arg[])
    {
        System.out.println("All persons information:");
        Person ob1=new Person(101,"Pratiksha",20,"Female");
        Person ob2=new Person(102,"Bhakti",21,"Female");
        Person ob3=new Person(103,"Dipak",17,"Male");
        Person ob4=new Person(104,"Sakshi",19,"Female");
        Person ob5=new Person(105,"Ajay",21,"Male");
    }
}