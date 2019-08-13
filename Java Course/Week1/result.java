import java.util.Scanner;
public class Exercise1_5
{
  public static void main(String[] args) {
  Scanner input = new Scanner(System.in);
  double mark_avg;
  int result;
  int i;
  int s;
  
  //define size of array
  
  s = input.nextInt();
  
  //The array is defined "arr" and inserted marks into it.
  
  int[] arr = new int[s];   
  for(i=0;i<arr.length;i++)
  {
    arr[i]=input.nextInt();
  } 
  
  //Initialize maximum element as first element of the array.
  
  int max=arr[0];
  
  //Traverse array elements to get the current max.
	
  for(i=0;i<arr.length;i++)
    {
      	if(arr[i]>max)
        {
          max=arr[i];
        }
    }
  
  //Store the highest mark in the variable result.
	
  result=max;
  
  //Store average mark in avgMarks.
	
  int total=0;
	for(i=0;i<arr.length;i++)
    {
      	total=total+arr[i];
    }
	mark_avg=total/arr.length;
	System.out.println(result);
	System.out.print(mark_avg);
   }
}
