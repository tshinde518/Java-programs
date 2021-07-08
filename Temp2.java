// Write a program to convert temperature in Kelvin to Fahrenheit.

import java.util.Scanner;
class Temp2
{
  public static void main(String [] args)
  {
    Double frh, kel;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter the temp in Kelvin:");
    kel=Scanner.nextDouble() ;
    frh = (9.0 / 5) * (kel - 273.15) + 32;
  System.out.println("Temperature in Fahrenheit:" +frh);
  }
}