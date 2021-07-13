// 53. Write a program to calculate area of an equilateral triangle.

import java.util.Scanner;
class Equilateral
{
  public static void main(String [] args)
  {
    double s, area;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter side: ");
    s=Scanner.nextDouble();
    area=(Math.sqrt(3)/4)*(s*s);
    System.out.println("Area of equilateral triangle:"+area);
  }
}