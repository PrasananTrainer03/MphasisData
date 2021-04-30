package com.java.mphasis.inv;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StockDAO {

	Connection con;
	PreparedStatement pst;
	
	public String addStock(Stock stock) throws SQLException {
		con = ConnectionHelper.getConnection();
		String cmd = "insert into stock(StockId,ItemName,Price,QuantityAvail) "
				+ " values(?,?,?,?)";
		String sid = generateStockId();
		pst = con.prepareStatement(cmd);
		pst.setString(1, sid);
		pst.setString(2, stock.getItemName());
		pst.setDouble(3, stock.getPrice());
		pst.setInt(4, stock.getQuantityAvail());
		pst.executeUpdate();
		return "Stock Added Successfully...";
	}
	public String generateStockId() throws SQLException {
		String cmd ="select case when max(stockId) IS NULL then 'S000' "
				+ " else max(stockId) end sid from Stock";
		con = ConnectionHelper.getConnection();
		pst = con.prepareStatement(cmd);
		ResultSet rs = pst.executeQuery();
		rs.next();
		String stockId=rs.getString("sid");
		int sid=Integer.parseInt(stockId.substring(1));
		sid++;
		if (sid>=1 && sid<=9) {
			stockId="S00"+sid;
		}
		if (sid >=10 && sid<=99) {
			stockId="S0"+sid;
		}
		if (sid >=100 && sid<=999) {
			stockId="S"+sid;
		}
		return stockId;
	}
}
