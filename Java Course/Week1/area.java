import java.util.Scanner;  
public class area {
       public static void main(String[] args) {
Scanner s = new Scanner(System.in); 
       double radius= s.nextDouble();
       double perimeter;
       double area;
//Calculate the perimeter 
		perimeter = 2 * Math.PI * radius;
		System.out.println(perimeter);
//Calculate the area

		area = Math.PI * Math.pow(radius,2);
		System.out.print(area);
    }
  }
