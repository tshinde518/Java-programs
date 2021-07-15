// Armstrong number

import java.util.Scanner;
class Armstrong
{
  public static void main(String [] args)
  {
   int n,r,sum=0,temp;
   Scanner Scanner; 
   Scanner=new Scanner(System.in);
   System.out.println("Enter number:");
   n=Scanner.nextInt();
   temp=n;
   while(n>0)
   {
     r=n%10;
     sum=sum+(r*r*r);
     n=n/10;
   }
    if(temp==sum)
    {
      System.out.println("Armstrong number");
    }
    else
    {
      System.out.println("Not Armstrong number");
    }
   }
}