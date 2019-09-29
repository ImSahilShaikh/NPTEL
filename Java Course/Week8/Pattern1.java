import java.util.*;
public class Pattern1 
{
	public static void main(String[] args)
	{
	        Scanner inr = new Scanner(System.in);	
		int n = inr.nextInt();
		//int i=0,j=0;
      		int count=0;
        	// Add the necessary code in the below space
		
		int space=n-1;
		int star=1;
		int no_of_star=0;
		for (int i=0;i<n;i++)
        	{
			for(int j=0;j<space;j++)
				System.out.print("  ");
			for(int j=0;j<star;j++)
			{
				System.out.print("* ");
				no_of_star++;
        		}
        		space--;
        		star+=2;
       	 		System.out.println();
      		}
	System.out.print(no_of_star);
	}
}
