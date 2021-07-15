// Check Leap year

import java.util.Scanner;
class Leap
{
   public static void main(String [] args)
   {
     int y;
     Scanner Scanner;
     Scanner=new Scanner(System.in);
     System.out.println("enter year:");
     y=Scanner.nextInt();
     if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
     {
      System.out.println("Entered year is a leap year");
     }
     else
     {
      System.out.println("Entered year is not a leap year");
     }
   }
}