// 45. Write a program to calculate the volume of a cube.

import java.util.Scanner;
class Cube1
{
   public static void main(String [] args)
   {
    int s;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter Side of cube: ");
    s=Scanner.nextInt() ;
    double vol;
    vol=s*s*s;
    System.out.println("volume of cube:"+vol);
    }
}