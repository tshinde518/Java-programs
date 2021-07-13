// program to calculate volume of Cylinder

import java.util.Scanner;
class Cylinder1
{
  public static void main(String [] args)
  {
    int r, h;
    double vol;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter radius: ");
    r=Scanner.nextInt() ;
    System.out.println("Enter height: ");
    h=Scanner.nextInt() ;
    vol=3.14*r*r*h;
    System.out.println("Volume of cylinder:" +vol);
   }
}