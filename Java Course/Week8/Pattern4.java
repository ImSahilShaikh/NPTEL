import java.util.*;
public class Pattern4
{
	public static void main(String[] args)
	{
		Scanner inr = new Scanner(System.in);
		int l = inr.nextInt();
		// Add the necessary code in the below space
		if(l%2==0)
			System.out.print("Invalid line number");
		else
		{
			int space=l/2;
			int star=1;
			int n=space+1;
			for (int i=0;i<n;i++)
			{
				for(int j=0;j<space;j++)
					System.out.print(" ");		//only 1 space needed
                		for(int j=0;j<star;j++)
                		{
					System.out.print("* ");
                		}
				space--;
				star++;
				System.out.println();
			}	
        		//2nd for loop

        		int space1=l/2;
        		int n1=space1;
        		int star1=space1;
        		int sp=1;
            		for(int i=0;i<n1;i++)
            		{
				for(int j=0;j<sp;j++)
					System.out.print(" ");
				for(int j=space1;j>0;j--)
				{
					if(j==1)
						System.out.print("*");
					else
						System.out.print("* ");
				}
				sp++;
				space1--;
				System.out.println();
			}
		}    
	}
}
