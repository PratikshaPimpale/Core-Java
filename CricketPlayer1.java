import java.util.*;
class CricketPlayer
{
    String pname;
    int no_of_times_not_out,no_of_innings,tot_runs;
    float bat_avg;
    void accept()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("\nEnter Player name:");
        pname=sc.next();
        System.out.print("\nEnter total runs:");
        tot_runs=sc.nextInt();
        System.out.print("\nEnter No of Innings:");
        no_of_innings=sc.nextInt();
        System.out.print("\nEnter No of times not out:");
        no_of_times_not_out=sc.nextInt();
    }

    void cal()
    {
        bat_avg=tot_runs/no_of_times_not_out;
    }

    void disp()
    {
        System.out.println("\nPlayer name="+pname);
        System.out.println("Total runs="+tot_runs);
        System.out.println("No of Innings="+no_of_innings);
        System.out.println("No of times not out="+no_of_times_not_out);
        System.out.println("Bat average="+bat_avg);
    }
    public static void main(String arg[])
    {
        CricketPlayer ob=new CricketPlayer();
        ob.accept();
        ob.cal();
        ob.disp();
    }
}