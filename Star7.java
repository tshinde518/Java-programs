/* Print pattern

 *******
  *****
   ***
    *   */

class Star7
{
  public static void main(String [] args)
  {
    int n=4;
    for(int i=n;i>=1;i--)
    {
     for(int k=1;k<=(i*2)-1;k++)
      {
       System.out.print("*");
      }
     for(int j=n;j>=i;j--)
      {
        System.out.print(" ");
      }
      System.out.println(" ");
   }
 }
}