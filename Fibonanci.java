// Fibonanci series

class Fibonanci
{
   public static void main(String [] args)
   {
     int n=10,n1=0,n2=1,n3;
     System.out.print("Fibonacci Series of "+n +" numbers:");
     for(int i=1;i<=n;i++)
     { 
        System.out.print(n1+" ");
       n3=n1+n2;
       n1=n2; 
       n2=n3;
      }
      
    }
}
   