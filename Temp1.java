//21. Write a program to convert temperature in Fahrenheit to Celsius.
// Write a program to convert temperature in Fahrenheit to celsius.

import java.util.Scanner;
class Temp1
{
  public static void main(String [] args)
  {
    Double frh, cel;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the temp in Fahrenheit:");
    frh=Scanner.nextDouble() ;
    cel = 5 * (frh - 32) / 9;
  System.out.println("Temperature in celsius:" +cel);
  }
}