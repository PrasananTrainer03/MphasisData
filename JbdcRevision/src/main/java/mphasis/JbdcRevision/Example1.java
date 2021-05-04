package mphasis.JbdcRevision;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Example1 {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		 try (Statement stmt =
			      con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE)) {
			      ResultSet uprs = stmt.executeQuery("SELECT * FROM Employ");
			      while (uprs.next()) {
			    	  System.out.println("Hi");
			       // float f = uprs.getFloat("PRICE");
			        uprs.updateString("Name", "Manoj");
			        uprs.updateRow();
			        System.out.println("Row Updated...");
			      }
			    } catch (SQLException e) {
			    	System.out.println(e);
			    }
	}
}
