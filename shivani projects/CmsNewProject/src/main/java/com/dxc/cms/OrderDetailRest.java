package com.dxc.cms;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/orders")
public class OrderDetailRest {

	@POST
	@Path("/placeorder")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String placeOrder(OrderDetail orderdetail) throws SQLException  {
		String result = new OrderDAO().placeOrder(orderdetail);
		return result;
	}
	@GET
	@Path("/vendor/{venId}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderDetail[] vendorOrders(@PathParam("venId") int venId) throws SQLException {
		OrderDetail[] list = new OrderDAO().vendorOrder(venId);
		return list;
	}
	@GET
	@Path("/vendorpending/{venId}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderDetail[] vendorPendingOrders(@PathParam("venId") int venId) throws SQLException {
		OrderDetail[] list = new OrderDAO().vendorPendingOrder(venId);
		return list;
	}
	@GET
	@Path("/customer/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderDetail[] customerOrders(@PathParam("custId") int custId) throws SQLException {
		OrderDetail[] list = new OrderDAO().customerOrder(custId);
		return list;
	}
	@GET
	@Path("/customerpending/{custId}")
	@Produces(MediaType.APPLICATION_JSON)
	public OrderDetail[] customerPendingOrders(@PathParam("custId") int custId) throws SQLException {
		OrderDetail[] list = new OrderDAO().customerPendingOrder(custId);
		return list;
	}

}
