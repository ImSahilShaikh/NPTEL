import java.util.Scanner; //This package for reading input
public class A1
{ 
  public static void main(String args[]) { 
  Scanner sc = new Scanner(System.in);
  int n=sc.nextInt(); //Read an integer
  System.out.println(fib(n)); //Generate and print the n-th Fibonacci number
} 

static int fib(int n) 
{
  //complete the code segment to find the nth Fibonacci number in the Fibonacci sequence and return the value. Write the function recursively.
  n=n-1;
  int a = 0, b = 1, c;
  if (n == 0)
  return a;
  for (int i = 2; i <= n; i++)
  {
      c = a + b;
      a = b;
      b = c;
  }
  return b;
  }  
}  
