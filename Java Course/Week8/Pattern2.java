import java.util.*;
public class Pattern2
{
	public static void main(String[] args)
	{
		Scanner inr = new Scanner(System.in);	
		int n = inr.nextInt();
		// Add the necessary code in the below space
		int space=n-1;
		int star=1;
		int no_of_star=0;
      
		for (int i=0;i<n;i++)
		{
			for(int j=0;j<space;j++)
        		System.out.print(" ");		//only 1 space needed
		        for(int j=0;j<star;j++)
		        {
		        	System.out.print("* ");
				no_of_star++;	//increment only 1 
			}
			space--;
			star++;
			System.out.println();
		}
    }    
}
