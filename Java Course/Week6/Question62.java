class ThreadRun implements Runnable 
{
  public void run()
  { 
    System.out.print("Thread using Runnable interface."); 
  } 
}

// Create main class Question62 with main() method and appropriate statements in it
public class Question62
{
  public static void main(String ar[])
  {
  	ThreadRun tr=new ThreadRun();
    Thread t = new Thread(tr);
    t.start();
  }
}
