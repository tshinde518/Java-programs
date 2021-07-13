// 54. Write a program in to enter P, T, R and calculate Simple Interest.

import java.util.Scanner;
class Interest
{
   public static void main(String [] args)
   {
     int p,t,r,si;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the principle:");
     p=Scanner.nextInt();
     System.out.println("Enter rate of interest :");
     r=Scanner.nextInt();
     System.out.println("Enter time :");
     t=Scanner.nextInt();
     si=p*t*r/100;
     System.out.println("Simple interest:" +si);
   }
}