// Write the appropriate statement(s) to import the package(s) you need in your program
import java.io.*;

public class Question1{ 
        public static void main (String[] args) throws IOException{
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
          String a=br.readLine();
          String b=br.readLine();
          String c=br.readLine();
          
          //Write the appropriate code to read the 3 integer values and find their sum.
          
          int sum=Integer.parseInt(a)+Integer.parseInt(b)+Integer.parseInt(c);
          System.out.println(sum);
    }
}
