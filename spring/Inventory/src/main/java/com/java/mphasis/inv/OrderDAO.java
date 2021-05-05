package com.java.mphasis.inv;

import java.util.List;

public class OrderDAO {

	private List<Order> items;

	public List<Order> getItems() {
		return items;
	}

	public void setItems(List<Order> items) {
		this.items = items;
	}
	
	public void display() {
		for(Order o : items) {
			o.displayOrder();
			int value=o.getQtyord()-o.getProduct().getQuantityAvail();
			if(!(value>=0)){
				System.out.println("Total Amount="+(o.getProduct().getPrice()*o.getQtyord()));
			}
			else{
				System.out.println("Insufficient Product Quantity...");
			}
		}
	}
}
