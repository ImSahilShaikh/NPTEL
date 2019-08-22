import java.util.Scanner;

 public class Circle extends Point{
	 	  
     public static void main(String[] args) {
    
	 Scanner sc = new Scanner(System.in);
	 Point c=new Point(); //Create a point center
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  //Create a point on circumference
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circle c1=new Circle(); //Create an object of class Circle
	 c1.distance(c,p);  //Calcualte radius of the circle
	
  }
 
}

//Complete the code segment to define a class Point with variable x,y and method distance() that calculates the distance between two points.
//Note: Pass objects of type class Point as argument in distance() method. 
class Point{

double x=0, y=0;
  double di=0;
  void distance(Point p1, Point p2)
    {
    di = Math.sqrt( ( ( (p2.x)-(p1.x) )*( (p2.x)-(p1.x) ) ) + ( ( (p2.y)-(p1.y) )*( (p2.y)-(p1.y) )) );
    System.out.print(di);
    }
 
}
