package mphasis.JbdcRevision;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class Example3 {

	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		PreparedStatement ps=con.prepareStatement("select * from employ");  
		ResultSet rs=ps.executeQuery();  
		ResultSetMetaData rsmd=rs.getMetaData();  
		  
		System.out.println("Total columns: "+rsmd.getColumnCount());  
		System.out.println("Column Name of 1st column: "+rsmd.getColumnName(1));  
		System.out.println("Column Type Name of 1st column: "+rsmd.getColumnTypeName(1));  
		  
	}
}
