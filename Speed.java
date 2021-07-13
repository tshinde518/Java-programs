// 51. Write a program in C++ that converts kilometers per hour to miles per hour.


import java.util.Scanner;
class Speed
{
  public static void main(String [] args)
  {
    double  miph, kmph;
     Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter distance in kilometer per hour:");
    kmph=Scanner.nextInt() ;
    miph=(kmph*0.6213712);
    System.out.println(" The distance in miles per hour is: "+miph);
    
   }
}