import java.sql.*;
import java.util.Properties;
import org.*; // import postgresql-42.1.4.jar

public class DBHandler {

	public static void main(String args[]) {
	      Connection c = null;
	      try {
	    	  
	    	 /* CARICO IL DRIVER DA UTILIZZARE*/
	         Class.forName("org.postgresql.Driver");		
	         
	    
	       /* USO IL DRIVER PER CONNETTERE IL PROGRAMMA AL DATABASE (IN POSTGRES) VOLUTO */
	       /* host (ospite) del database, userID, password */
	       c = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres","postgres", "");
	       
	       
	       /* ESEGUO UNA QUERY */
	       Statement stmt = c.createStatement();
	       
	       			
	       /* ESEGUO DELLA QUERY */
	       ResultSet  rsStmt = stmt.executeQuery ("select * from public.\"TestTable\" where id = 1");
	       
	       
	       /* MOSTRO IL RISULTATO DLLA QUERY*/
	       while (rsStmt.next()) 
	       { 
	       System.out.println ((rsStmt.getInt("id"))); 
	       System.out.println ((rsStmt.getString("name"))); 
	       } 
	      
	       
	      } catch (Exception e) {
	         e.printStackTrace();
	         System.err.println(e.getClass().getName()+": "+e.getMessage());
	         System.exit(0);
	      }
	      System.out.println("Opened database successfully!");
	   }

}
