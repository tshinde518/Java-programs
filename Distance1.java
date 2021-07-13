// 50. write a program in java to enter length in centimeter and convert it into meter and kilometer.

import java.util.Scanner;
class Distance1
{
  public static void main(String [] args)
  {
    double km, met,cent;
     Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the distance in centimeter:");
    cent=Scanner.nextInt() ;
    met = (cent/100);
    km = (cent/100000);
    System.out.println(" The distance in meter is: "+met);
    System.out.println(" The distance in kilometer is: "+km);
   }
}