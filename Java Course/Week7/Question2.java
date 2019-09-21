import java.io.*;  
public class Question2{  
public static void main(String args[]){
  //Use appropriate Try..catch block to complete the code  
	InputStreamReader r=new InputStreamReader(System.in);  
  BufferedReader br=new BufferedReader(r);  
	int x=0;
	String number=null;
	try{
      number=br.readLine();
  }
	catch(Exception e)
  {
    	System.out.print("Error");
  }
  try
  {
      x = Integer.parseInt(number);
      System.out.print(x*x);
  }
	catch(NumberFormatException ne)
  {
    	System.out.print("Please enter valid data");
  }
 }  
} 
