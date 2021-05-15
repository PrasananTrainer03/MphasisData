package com.dxc.cms;

import java.sql.SQLException;
import java.util.Date;

public class Test {
	public static void main(String[] args) throws SQLException {
//		MenuDAO dao = new MenuDAO();
//		Menu[] list = dao.showMenu();
//		for (Menu menu : list) {
//			System.out.println(menu);
//		}
//		Menu menu = new MenuDAO().searchByMenuId(1);
//		System.out.println(menu);
//		try {
//			int res = new CustomerDAO().authenticate("Rohit","Rohit123");
//			System.out.println(res);
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		System.out.println(new VendorDAO().authenticate("Ranjan", "ranjan123"));
		OrderDetail ord = new OrderDetail();
		ord.setCusId(1);
		ord.setOrdTime(new Date());
		ord.setFoodId(1);
		ord.setVenId(1);
		ord.setQtyOrder(1);
		ord.setWalType("PAYTM");
		ord.setOrdComments("Make it fast");
		System.out.println(new OrderDAO().placeOrder(ord));
		
//		OrderDetail[] list = new OrderDAO().customerOrder(1);
//		for (OrderDetail orderDetail : list) {
//			System.out.println(orderDetail);
//		}
//		OrderDetail[] list = new OrderDAO().customerPendingOrder(1);
//		for (OrderDetail orderDetail : list) {
//			System.out.println(orderDetail);
//		}
		
//		OrderDetail[] list = new OrderDAO().vendorOrder(1);
//		for (OrderDetail orderDetail : list) {
//			System.out.println(orderDetail);
//		}
		
//		OrderDetail[] list = new OrderDAO().vendorPendingOrder(1);
//		for (OrderDetail orderDetail : list) {
//			System.out.println(orderDetail);
//		}
	}
}
