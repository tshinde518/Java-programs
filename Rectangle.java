// Program to find aarea and perimeter of a rectangle

class Rectangle
{
  public static void main(String [] args)
  {
   int l=24,w=12;
   double area, peri;
   area=l*w;
   peri=2*(l+w);
   System.out.println("Area of Rectangle:" +area);
   System.out.println("Perimeter of Rectangle:" +peri);
  }
}