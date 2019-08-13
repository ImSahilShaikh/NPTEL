import java.util.Scanner;
public class Exercise1_4 
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int result=0;
    int temp=n;	
    int sum=0; 
    //Use while loop check the number is Armstrong or not.
    while(n>0)
    {
      result=n%10;
        sum=sum+(result*result*result);
        n=n/10;
    }

    //store the output(1 or 0) in result variable.

    if(temp==sum)
    {
      System.out.print("1");
    }
    else
      System.out.print("0");
   }
}
