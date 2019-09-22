import java.util.*;
public class Question3 {  
    public static void main(String[] args) { 
      try{	
        byte barr[]={'N','P','T','E','L','-','J','A','V','A','J','A','N','-','N','O','C','C','S','E'};
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        // Complete the code to get specific indexed byte value and its corresponding char value.
        System.out.println(barr[n]);
        String mystring = new String(barr,"UTF-8");
        System.out.print(mystring.charAt(n));
      }
      catch (Exception e){
          System.out.println("exception occur");
      }	   
    }
} 
