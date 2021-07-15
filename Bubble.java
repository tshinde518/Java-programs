// Bubble sort

import java.util.Scanner;
class Bubble
{
  public static void main(String [] args)
  {
    int n, temp;
    Scanner Scanner;
    Scanner=new Scanner(System.in);
    System.out.println("Enter array size:");
    n=Scanner.nextInt();

    int arr[]=new int[n];
    System.out.println("Enter array elements:");
    for(int i=0;i<n;i++)
    {
        
       arr[i]=Scanner.nextInt();
    }
    System.out.println("sorting the array using bubble sort technique");
    for(int i=0;i<(n-1);i++)
    {
     for(int j=0;j<(n-i-1);j++)
     {
       if(arr[j]>arr[j+1])
       {
         temp=arr[j];
         arr[j]=arr[j+1];
         arr[j+1]=temp;
       }
     } 
    }
   System.out.println("Array sorted successfully");
   System.out.println("The new array is");
   for(int i=0;i<n;i++)
   {
     System.out.println(arr[i]);
   }
  }
}