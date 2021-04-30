package com.java.mphasis.inv;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStockMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Stock stock = new Stock();
		System.out.println("Enter Item Name  ");
		stock.setItemName(sc.nextLine());
		System.out.println("Enter Price  ");
		stock.setPrice(Double.parseDouble(sc.nextLine()));
		System.out.println("Enter Quantity Available  ");
		stock.setQuantityAvail(Integer.parseInt(sc.nextLine()));
		StockDAO dao = new StockDAO();
		try {
			//System.out.println(dao.generateStockId());
			System.out.println(new StockDAO().addStock(stock));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
