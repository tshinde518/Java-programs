// Find sum of elements in an array

class Sum_arr
{
  public static void main(String [] args)
  {
   int arr[]={1,3,7};
   int n=3, sum=0;
   for (int i=0;i<n;i++)
   {
    sum=sum+arr[i];
   }
   System.out.println("The sum of array is " +sum);
  }
}