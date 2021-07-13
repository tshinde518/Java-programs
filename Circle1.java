// 43. Write a language program which accepts the radius of a circle from the user and compute the area and circumference.

import java.util.Scanner;
class Circle1
{
  public static void main(String [] args)
  {
    int r;
    double area,circum;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter radius of circle: ");
    r=Scanner.nextInt() ;
    area=3.14*r*r;
    circum=2*3.14*r;
    System.out.println("area of circle:"+area);
    System.out.println("circumference of circle:"+circum);
  }
}
