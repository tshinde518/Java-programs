// Write a program to check whether a number is positive, negative or zero.

import java.util.Scanner;
class Positive
{
  public static void main(String [] args)
  {
   int num;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter a number:");
    num=Scanner.nextInt();
    if (num>0)
    {
      System.out.println("The number is positive");
    }
    else if(num<0)
    {
      System.out.println("The number is negative");
    }
    else
    {
       System.out.println("The number is zero");
    }
   }
}