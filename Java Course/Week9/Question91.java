import java.util.Scanner;
public class Question91
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine(); // Read as string, e.g., 5+6

		// Declare and initialize the required variable(s)
		char a[]=input.toCharArray();
		char operator=a[1];	        	
		
		// Split the input string into character array
		double x=(double)(a[0]-'0');
		double y=(double)(a[2]-'0');
		
		/*
		Write your method to separate two operands
		and operators and then perform the required operation.
		*/
		// Print the output as stated in the question
		if(operator=='+')
			System.out.print(input+" = "+Math.round(x+y));
		else if(operator=='-')
			System.out.print(input+" = "+Math.round(x-y));
		else if(operator=='*')
			System.out.print(input+" = "+Math.round(x*y));
        	else if(operator=='/')
			System.out.print(input+" = "+Math.round(x/y));

	}
}
