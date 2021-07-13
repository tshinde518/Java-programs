 // 37.Write a program to print a mystery series from 1 to 50.

class Mystery
{
  public static void main(String [] args)
  {
    int n = 1;
   while (true)
   {
      ++n;
      if ((n % 3) == 0)
      continue;
      if (n == 50)
      break;
      if ((n % 2) == 0)
      {
         n += 3;
      }
      else
      {
         n -= 3;
      }
      System.out.println(n);
   }
 }
}
