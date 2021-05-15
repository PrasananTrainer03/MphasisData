package com.dxc.cms;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MenuDAO {

	Connection connection;
	PreparedStatement pst;
	
	public Menu searchByMenuId(int menuId) throws SQLException {
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("select * from Food_Item WHERE "
				+ " FOOD_ID=?");
		pst.setInt(1, menuId);
		ResultSet rs = pst.executeQuery();
		FoodStatus fs=FoodStatus.AVAILABLE;
		Menu menu = null;
		if (rs.next()) {
			menu = new Menu();
			menu.setFoodId(rs.getInt("FOOD_ID"));
			menu.setFoodName(rs.getString("FOOD_NAME"));
			menu.setFoodDetail(rs.getString("FOOD_DETAIL"));
			menu.setFoodPrice(rs.getDouble("FOOD_PRICE"));
			fs=FoodStatus.valueOf(rs.getString("Food_Status"));
			menu.setFoodStatus(fs);
			menu.setFoodRating(rs.getString("FOOD_RATING"));

		}
		return menu;
	}
	public Menu[] showMenu() throws SQLException {
		connection = ConnectionHelper.getConnection();
		pst = connection.prepareStatement("select count(*) cnt from food_item");
		ResultSet rs = pst.executeQuery();
		rs.next();
		int cnt = rs.getInt("cnt");
		pst = connection.prepareStatement("select * from food_item");
		rs = pst.executeQuery();
		Menu[] menuList = new Menu[cnt];
		Menu menu = null;
		int i=0;
		FoodStatus fs=FoodStatus.AVAILABLE;
		while(rs.next()) {
			menu = new Menu();
			menu.setFoodId(rs.getInt("FOOD_ID"));
			menu.setFoodName(rs.getString("FOOD_NAME"));
			menu.setFoodDetail(rs.getString("FOOD_DETAIL"));
			menu.setFoodPrice(rs.getDouble("FOOD_PRICE"));
			fs=FoodStatus.valueOf(rs.getString("Food_Status"));
			menu.setFoodStatus(fs);
			menu.setFoodRating(rs.getString("FOOD_RATING"));
			
			menuList[i]=menu;
			i++;
		}
		return menuList;
	}
}
