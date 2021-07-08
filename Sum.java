// Program to print the sum of two numbers using variables

import java.util.Scanner;
class Sum
{
  public static void main(String [] args)
   {
    int a,b,sum;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter number 1:");
    a=Scanner.nextInt();
    System.out.println("Enter number 2:");
    b=Scanner.nextInt();
    sum=a+b;
    System.out.println("Sum=" +sum);
   }
}