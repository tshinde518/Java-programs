// 54. Write a program in to enter P, T, R and calculate compound Interest.

import java.util.Scanner;
class Interest1
{
   public static void main(String [] args)
   {
     int p,t,r;
     double ci,cp;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("Enter the principle:");
     p=Scanner.nextInt();
     System.out.println("Enter rate of interest :");
     r=Scanner.nextInt();
     System.out.println("Enter time :");
     t=Scanner.nextInt();
     ci=p* Math.pow((1+(r/100)),t)-p;
     cp=p* Math.pow(1+(r/100),t);
     System.out.println("The Interest after compounded for the amount:" +ci);
     System.out.println("The total amount after compounded for the amount:" +cp);
   }
}