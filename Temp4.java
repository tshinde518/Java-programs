//21. Write a program to convert temperature in Fahrenheit to Celsius.
// Write a program to convert temperature in Fahrenheit to Kelvin.

import java.util.Scanner;
class Temp4
{
  public static void main(String [] args)
  {
    Double frh, kel;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the temp in Fahrenheit:");
    frh=Scanner.nextDouble() ;
    kel = (5.0 / 9) * (frh - 32) + 273.15;
  System.out.println("Temperature in kelvin:" +kel);
  }
}