package com.java.mphasis.inv;

public class Order {

	private int qtyord;
	private int orderid;
	private Product product;
	public int getQtyord() {
		return qtyord;
	}
	public void setQtyord(int qtyord) {
		this.qtyord = qtyord;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
	public void displayOrder(){
		System.out.println("Quantity ordered : "+qtyord+" Order ID : "+orderid);
		product.showProduct();
	}
}
