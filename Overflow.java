// program to check overflow/underflow during arithmeic operations

class Overflow
{
  public static void main(String [] args)
  {
   System.out.println("Range of integer is [-2147483648, 2147483647]") ;
   int n1=2147483647 ;
   System.out.println(" Overflow the integer range and set in minimum range : " + n1 + 1) ;
   System.out.println(" Increasing from its minimum range : " + n1 + 2);
   System.out.println(" Product is :" + n1 * n1 );

   int n2=-2147483647 ;
   System.out.println(" Underflow the integer range and set in maximum range : " + (n2-1)) ;
   System.out.println(" Decreasing from its maximum range : " + (n2-2));
   System.out.println(" Product is :" + n2 * n2 );
  }
}