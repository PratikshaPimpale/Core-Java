/*3. Write a java program to accept details of  ‘n’  cricket players(pid, pname, totalRuns, 
InningsPlayed, NotOuttimes). Calculate the average of all the players. Display the details 
of player having maximum average. */

import java.util.*;
class Player
{
    int pid,totruns,innings,notout;
    String name;
    float avg;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter player id,name,totalruns,inningsplayed,notouttimes:");
        pid=sc.nextInt();
        name=sc.next();
        totruns=sc.nextInt();
        innings=sc.nextInt();
        notout=sc.nextInt();
    }
    void cal()
    {
        avg=(totruns+innings)/notout;
    }
    void disp()
    {
        cal();
        System.out.println("\nPlayer id="+pid);
        System.out.println("Name="+name);
        System.out.println("Average="+avg);

    }
}
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit:");
        int n=sc.nextInt();
        Player ob[]=new Player[n];
        int i;
        for(i=0;i<n;i++)
        {
            ob[i]=new Player();
            ob[i].accept();
        }
        for(i=0;i<n;i++)
            ob[i].disp();
        
        float max=ob[0].avg;
        int index=0;
        for(i=0;i<n;i++)
        {
            if(ob[i].avg>max)
            {
                max=ob[i].avg;
                index=i;
            }
        }
        System.out.println("\nPlayer having maximum average");
        ob[index].disp();
    }
}