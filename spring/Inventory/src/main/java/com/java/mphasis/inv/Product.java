package com.java.mphasis.inv;

public class Product {

	private String name;
	private int quantityAvail;
	private int price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantityAvail() {
		return quantityAvail;
	}
	public void setQuantityAvail(int quantityAvail) {
		this.quantityAvail = quantityAvail;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void showProduct(){
		System.out.println("Product : "+name+" Quantity Available : "+quantityAvail+" Price : "+price);
	}
}
