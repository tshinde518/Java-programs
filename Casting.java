// Write a program to test the Type Casting

 class Casting
 {
  public static void main(String [] args)
  {
    int a=4,b=8;
     System.out.println(a/b);
     System.out.println((double)a/b);
     System.out.println(a/(double)b);
     System.out.println((double)(a/b));
    
    double c=5.5, d=6.6;
     System.out.println("Test implicit type casting :") ;
     System.out.println((int)(c/d));
     System.out.println((int)(c/b));
     System.out.println("int implicitly casts to double:") ;
     c = a;
     System.out.println(c);
     System.out.println("double truncates to int:");
     d = b;
     System.out.println(d);
   }
 }
    
  