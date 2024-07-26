//4. Write a java program to display transpose of given matrix. 

import java.util.*;
class Demo
{
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter limit for rows & cols:");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int a[][]=new int[m][n];
        int i,j;
        System.out.println("Enter "+(m*n)+" values:");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }

        System.out.println("original matrix");
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }

        System.out.println("Transpose matrix");
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(" "+a[j][i]);
            }
            System.out.println();
        }
    }
}