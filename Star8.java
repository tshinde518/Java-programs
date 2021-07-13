/* Print pattern
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
   */

class Star8
{
  public static void main(String [] args)
  {
    int n=5;
    for (int i=1; i<=n; i++) 
        { 
            // Print space in decreasing order 
            for (int j=n; j>i; j--)
            {
                System.out.print(" ");
            }
            // Print star in increasing order
            for (int k=1; k<=(i * 2) -1; k++) 
            { 
               System.out.print("*"); 
            } 
            System.out.println(); 
        } 
        for (int i=n-1; i>=1; i--)
        {
         // Print space in increasing order
            for (int j=n-1; j>=i; j--)
            {
                System.out.print(" ");
            }
            // Print star in decreasing order
            for (int k=1; k<=(i * 2) -1; k++)
            {
                System.out.print("*");
            }
            
            System.out.println();
        }
        
    }
}