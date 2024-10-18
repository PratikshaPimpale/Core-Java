/*A) Write a menu driven java program using command line arguments for the following:
 1. Addition 
2. Subtraction 
3. Multiplication
4. Division.*/
import java.util.*;
 class Demo
 {
    public static void main(String arg[])
    {
        int a=Integer.parseInt(arg[0]);
        int b=Integer.parseInt(arg[1]);
        Scanner sc=new Scanner(System.in);
        int ch;
        do
        {
            System.out.print("\n1-Addition \n2-Substraction \n3-Multiplication \n4-Division \nEnter choice:");
            ch=sc.nextInt();
            switch(ch)
            {
                case 1:System.out.println("Addition="+(a+b));
                        break;
                case 2:System.out.println("Substraction="+(a-b));
                        break;
                case 3:System.out.println("Multiplication="+(a*b));
                        break;
                case 4:System.out.println("Division="+(a/b));
                        break;
                default:System.out.println("Choice not match...");
            }
        }while(ch<5);  
    }
 }
