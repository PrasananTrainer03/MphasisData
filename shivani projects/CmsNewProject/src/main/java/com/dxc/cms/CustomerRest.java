package com.dxc.cms;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerRest {

	  @GET
	  @Path("/{user}/{password}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public final int cusID(@PathParam("user") final String user, @PathParam("password") final String password) throws SQLException {
	    final int count = new CustomerDAO().authenticate(user, password);
	    return count;
	  }
	  
	  @GET
	  @Path("/{custId}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Customer searchByCustomerId(@PathParam("custId") int custId) throws SQLException {
			Customer customer = new CustomerDAO().searchByCustomerId(custId);
			return customer;
	  }

	  @GET
	  @Path("/name/{custName}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Customer searchByCustomerName(@PathParam("custName") String custName) throws SQLException {
			Customer customer = new CustomerDAO().findByCustomerName(custName);
			return customer;
	  }

}
