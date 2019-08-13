// This is the main class Question
public class Constr{
	public static void main(String[] args){
		Answer a = new Answer(10,"MCQ");
	}
} 

class Answer{
	Answer(){
      
		System.out.println("You got nothing.");
	}
  
	Answer(int marks, String type){		
		this();
      System.out.print("You got "+marks+" for an "+ type);
	}
} 
