import java.sql.*;
import java.lang.*;
public class CalAverage {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
              String query="";
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              
              // Get the age of the players

// Write program to calculate the average age

// Print “Average age of players is XX” ; where XX is the INTEGER value of age.

String st ="SELECT AVE(Age) from PLAYERS";
stmt.executeUpdate(st);


			
		}
                catch(Exception e){ System.out.println(e);}  
	}  
}  
