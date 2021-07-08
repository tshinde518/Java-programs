//21. Write a program to convert temperature in Fahrenheit to Celsius.
// Write a program to convert temperature in  Celsius to Kelvin.

import java.util.Scanner;
class Temp5
{
  public static void main(String [] args)
  {
    Double cel, kel;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the temp in  Celsius:");
    cel=Scanner.nextDouble() ;
    kel = cel + 273.15;
  System.out.println("Temperature in kelvin:" +kel);
  }
}