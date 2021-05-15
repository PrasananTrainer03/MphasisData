package com.dxc.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class OrderDAO {

	public OrderDetail[] customerPendingOrder(int custId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select Count(*) cnt from Order_detail where CUS_ID=? AND ORD_STATUS='PENDING'";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		OrderDetail[] result = new OrderDetail[cnt];
		cmd = "select * from Order_detail where CUS_ID=? AND ORD_STATUS='PENDING'";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		rs = pst.executeQuery();
		OrderDetail orderDetail = null;
		int i=0;
		while(rs.next()) {
			orderDetail = new OrderDetail();
			orderDetail.setCusId(rs.getInt("CUS_ID"));
			orderDetail.setFoodId(rs.getInt("FOOD_ID"));
			orderDetail.setOrdId(rs.getInt("ORDER_ID"));
			orderDetail.setVenId(rs.getInt("VEN_ID"));
			orderDetail.setWalType(rs.getString("Wal_Type"));
			orderDetail.setQtyOrder(rs.getInt("QTY_ORDER"));
			OrderStatus ordStatus = OrderStatus.valueOf(rs.getString("ORD_STATUS"));
			orderDetail.setOrdStatus(ordStatus);
			orderDetail.setOrdAmount(rs.getDouble("ORD_AMOUNT"));
			result[i]=orderDetail;
			i++;
		}
		return result;
	}

	public OrderDetail[] customerOrder(int custId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select Count(*) cnt from Order_detail where CUS_ID=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		OrderDetail[] result = new OrderDetail[cnt];
		cmd = "select * from Order_detail where CUS_ID=?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, custId);
		rs = pst.executeQuery();
		OrderDetail orderDetail = null;
		int i=0;
		while(rs.next()) {
			orderDetail = new OrderDetail();
			orderDetail.setCusId(rs.getInt("CUS_ID"));
			orderDetail.setFoodId(rs.getInt("FOOD_ID"));
			orderDetail.setOrdId(rs.getInt("ORDER_ID"));
			orderDetail.setVenId(rs.getInt("VEN_ID"));
			orderDetail.setWalType(rs.getString("Wal_Type"));
			orderDetail.setQtyOrder(rs.getInt("QTY_ORDER"));
			OrderStatus ordStatus = OrderStatus.valueOf(rs.getString("ORD_STATUS"));
			orderDetail.setOrdStatus(ordStatus);
			orderDetail.setOrdAmount(rs.getDouble("ORD_AMOUNT"));
			result[i]=orderDetail;
			i++;
		}
		return result;
	}
	public OrderDetail[] vendorPendingOrder(int venId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select Count(*) cnt from Order_detail where VEN_ID=? AND ORD_STATUS='PENDING'";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, venId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		OrderDetail[] result = new OrderDetail[cnt];
		cmd = "select * from Order_detail where VEN_ID=? AND ORD_STATUS='PENDING'";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, venId);
		rs = pst.executeQuery();
		OrderDetail orderDetail = null;
		int i=0;
		while(rs.next()) {
			orderDetail = new OrderDetail();
			orderDetail.setCusId(rs.getInt("CUS_ID"));
			orderDetail.setFoodId(rs.getInt("FOOD_ID"));
			orderDetail.setOrdId(rs.getInt("ORDER_ID"));
			orderDetail.setVenId(rs.getInt("VEN_ID"));
			orderDetail.setWalType(rs.getString("Wal_Type"));
			orderDetail.setQtyOrder(rs.getInt("QTY_ORDER"));
			OrderStatus ordStatus = OrderStatus.valueOf(rs.getString("ORD_STATUS"));
			orderDetail.setOrdStatus(ordStatus);
			orderDetail.setOrdAmount(rs.getDouble("ORD_AMOUNT"));
			result[i]=orderDetail;
			i++;
		}
		return result;		
	}
	public OrderDetail[] vendorOrder(int venId) throws SQLException {
		Connection con = ConnectionHelper.getConnection();
		String cmd = "select Count(*) cnt from Order_detail where VEN_ID=?";
		PreparedStatement pst = con.prepareStatement(cmd);
		pst.setInt(1, venId);
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		OrderDetail[] result = new OrderDetail[cnt];
		cmd = "select * from Order_detail where VEN_ID=?";
		pst = con.prepareStatement(cmd);
		pst.setInt(1, venId);
		rs = pst.executeQuery();
		OrderDetail orderDetail = null;
		int i=0;
		while(rs.next()) {
			orderDetail = new OrderDetail();
			orderDetail.setCusId(rs.getInt("CUS_ID"));
			orderDetail.setFoodId(rs.getInt("FOOD_ID"));
			orderDetail.setOrdId(rs.getInt("ORDER_ID"));
			orderDetail.setVenId(rs.getInt("VEN_ID"));
			orderDetail.setWalType(rs.getString("Wal_Type"));
			orderDetail.setQtyOrder(rs.getInt("QTY_ORDER"));
			OrderStatus ordStatus = OrderStatus.valueOf(rs.getString("ORD_STATUS"));
			orderDetail.setOrdStatus(ordStatus);
			orderDetail.setOrdAmount(rs.getDouble("ORD_AMOUNT"));
			result[i]=orderDetail;
			i++;
		}
		return result;
	}
	  public String placeOrder(OrderDetail orderdetail) throws SQLException {
		  	Menu menu = new MenuDAO().searchByMenuId(orderdetail.getFoodId());
		  	Customer customer = new CustomerDAO().searchByCustomerId(orderdetail.getCusId());
		    //System.out.println(orderdetail.getFoodId());
		    // System.out.println(menu);
		    Wallet wallet = new WalletDAO().showByWalltType(orderdetail.getCusId(), orderdetail.getWalType());
		    System.out.println("Wallet Amount " + wallet.getWalAmount());
		    double walAmount = wallet.getWalAmount();
		    double price = menu.getFoodPrice();
		    Date today = new Date();
		    System.out.println(orderdetail.getOrdTime());
		    long diffTime = orderdetail.getOrdTime().getTime() - today.getTime();
		    long diffDays = diffTime / (60 * 60 * 1000 * 24);
		    // System.out.println("Diff Time " + diffDays);
		    double totalAmount = price * orderdetail.getQtyOrder();
		    if (walAmount < totalAmount) {
		      return "Insufficient Funds...";
		    }  else if (diffDays < 0)  {
		      return "Order Cannot placed yesterday...";
		    }   else {
		      double diff = walAmount - totalAmount;
		      System.out.println("Price is  " + menu.getFoodPrice());
		      orderdetail.setOrdStatus(OrderStatus.PENDING);
		      orderdetail.setOrdAmount(totalAmount);
		      java.sql.Date sqlDate = new java.sql.Date(orderdetail.getOrdTime().getTime());
		      String cmd = "Insert into order_detail(CUS_ID, FOOD_ID, VEN_ID, Wal_Type,"
		      		+ "QTY_ORDER, ORD_STATUS, ORD_AMOUNT,ORD_COMMENTS, ORD_TIME) VALUES(?, ?, ?, ?, ?,?,?,?,?)";
		      Connection con = ConnectionHelper.getConnection();
		      PreparedStatement pst = con.prepareStatement(cmd);
		      pst.setInt(1, orderdetail.getCusId());
		      pst.setInt(2, orderdetail.getFoodId());
		      pst.setInt(3, orderdetail.getVenId());
		      pst.setString(4, orderdetail.getWalType());
		      pst.setInt(5, orderdetail.getQtyOrder());
		      pst.setString(6, orderdetail.getOrdStatus().toString());
		      pst.setDouble(7, orderdetail.getOrdAmount());
		      pst.setString(8, orderdetail.getOrdComments());
		      pst.setDate(9, sqlDate);
		      pst.executeUpdate();
		      cmd = "Update Wallet SET WAL_AMOUNT=? WHERE WAL_TYPE=? AND CUS_ID=?";
		      pst = con.prepareStatement(cmd);
		      pst.setDouble(1, diff);
		      pst.setString(2, orderdetail.getWalType());
		      pst.setInt(3, orderdetail.getCusId());
		      pst.executeUpdate();
		      return "Order Placed Successfully...";
		    }
		  }

}
