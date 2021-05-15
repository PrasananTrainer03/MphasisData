package com.dxc.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class WalletDAO {

	public Wallet showByWalltType(int custId,String walType) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select * from wallet where Cus_Id=? AND WAL_TYPE=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		pst.setString(2, walType);
		ResultSet rs = pst.executeQuery();
		Wallet wallet = null;
		if (rs.next()) {
			wallet = new Wallet();
			wallet.setCusId(rs.getInt("CUS_ID"));
			wallet.setWalId(rs.getInt("WAL_ID"));
			wallet.setWalAmount(rs.getInt("WAL_AMOUNT"));
			WalType wtype = WalType.valueOf(rs.getString("WAL_TYPE"));
			wallet.setWalType(wtype);
		}
		return wallet;
	}
	public Wallet[] showByCustomerId(int custId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from Wallet where CUS_ID=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		Wallet[] result = new Wallet[cnt];
		cmd = "select * from wallet where cus_Id=?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		rs = pst.executeQuery();
		Wallet wallet = null;
		int i=0;
		while(rs.next()) {
			wallet = new Wallet();
			wallet.setCusId(rs.getInt("CUS_ID"));
			wallet.setWalId(rs.getInt("WAL_ID"));
			wallet.setWalAmount(rs.getInt("WAL_AMOUNT"));
			WalType wtype = WalType.valueOf(rs.getString("WAL_TYPE"));
			wallet.setWalType(wtype);
			result[i]=wallet;
			i++;
		}
		return result;
	}
}
