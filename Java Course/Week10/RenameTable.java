//This is question 5

import java.sql.*;
import java.lang.*;
public class RenameTable {
    public static void main(String args[]) {
        try {
              Connection conn = null;
              Statement stmt = null;
              String DB_URL = "jdbc:sqlite:/tempfs/db";
              System.setProperty("org.sqlite.tmpdir", "/tempfs");
            
              // Open a connection
              conn = DriverManager.getConnection(DB_URL);
              stmt = conn.createStatement();
	      
	      // Write the SQL command to rename a table
		String query="alter table players RENAME to SPORTS";
		// Execute the SQL command
	  	stmt.executeUpdate(query);
	        }
       catch(Exception e){ System.out.println(e);}  
    }
}
