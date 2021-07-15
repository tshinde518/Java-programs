// Factorial of number

import java.util.Scanner;
class Factorial
{
  public static void main(String [] args)
  {
    int i,fact=1,number;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter any Number:");
    number=Scanner.nextInt();
   
    for(i=1;i<=number;i++)
    {
      fact=fact*i;
    }
   System.out.println("Factorial of "+number+" is: "+fact);
  }
}
