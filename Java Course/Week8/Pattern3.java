import java.util.*;
public class Pattern3
{
	public static void main(String[] args)
	{
		Scanner inr = new Scanner(System.in);
		int n = inr.nextInt();
		// Add the necessary code in the below space
		int space=n-1;
		int star=1;	
		int sum=0;
		for (int i=0;i<n;i++)
		{
			int value=1;		//set value
			for(int j=0;j<space;j++)
				System.out.print("  ");
			for(int j=0;j<star;j++)
			{
				System.out.print(value+" ");//print value
				sum+=value;	//sum
				value++;	//increment
        		}
			space--;
			star+=2;
			System.out.println();
		}
		System.out.print(sum);
	}    
}
