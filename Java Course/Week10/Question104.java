import java.sql.*;
import java.lang.*;
public class CreateTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
              // The statement containing SQL command to create table "players"
		          String query="create table players(UID int,First_Name varchar(45),Last_Name varchar(45),Age int);";
              // Execute the statement containing SQL command below this comment
		          stmt.executeUpdate(query);
              
              }
       catch(Exception e)
       {
              System.out.println(e);
       }  
    }
}
