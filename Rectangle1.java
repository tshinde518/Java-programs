//40. Write a program to print the area and perimeter of a rectangle.

import java.util.Scanner;
class Rectangle1
{
  public static void main(String [] args)
  {
    	int w, l, area, peri;
        Scanner Scanner;
        Scanner=new Scanner(System.in);
        System.out.println("Enter length: ");
        l=Scanner.nextInt() ;
        System.out.println("Enter width: ");
        w=Scanner.nextInt() ;
    	area=(l*w);
	peri=2*(l+w);
        System.out.println(" The area of the rectangle is : "+area);
        System.out.println(" The perimeter of the rectangle is : " +peri);
       
  }
}
