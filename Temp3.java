// Write a program to convert temperature in Kelvin to celsius.

import java.util.Scanner;
class Temp3
{
  public static void main(String [] args)
  {
    Double kel, cel;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the temp in Kelvin:");
    kel=Scanner.nextDouble() ;
    cel = kel - 273.15;
  System.out.println("Temperature in Celsius:" +cel);
  }
}