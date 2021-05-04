package mphasis.JbdcRevision;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class SpCallExample {
	public static void main(String[] args) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String str = "{call prcAgentInsert(?,?,?,?)}";
		CallableStatement cs = con.prepareCall(str);
		cs.setString(1, "Hari");
		cs.setString(2, "Male");
		cs.setInt(3,66334);
		cs.setInt(4, 8823);
		cs.execute();
		System.out.println("Added...");
	}
}
