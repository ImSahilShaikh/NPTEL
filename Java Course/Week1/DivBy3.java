import java.util.Scanner;
public class DivBy3
{
  public static void main(String[] args) 
  {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    int sum=0;

    //Use for or while loop do the operation

    int i=0,nos=0;

    while(i<=n)
    {
        if(nos%2==0)
        {
                if(nos%3==0)
                {
                    sum=sum+nos;

                }
            i++;	
        }
        nos++;
    }
    System.out.print(sum);
    }
}
