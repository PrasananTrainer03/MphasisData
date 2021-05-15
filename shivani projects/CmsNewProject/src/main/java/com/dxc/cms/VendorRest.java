package com.dxc.cms;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/vendor")
public class VendorRest {

	@GET
	  @Path("/{user}/{password}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public final int cusID(@PathParam("user") final String user, @PathParam("password") final String password) throws SQLException {
	    final int count = new VendorDAO().authenticate(user, password);
	    return count;
	  }
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Vendor[] showVendor() throws SQLException {
		Vendor[] list = new VendorDAO().showVendors();
		return list;
	}
	@GET
	@Path("/{venName}")
	@Produces(MediaType.APPLICATION_JSON)
	public Vendor searchByVendorName(@PathParam("venName") String venName) throws SQLException {
		Vendor result = new VendorDAO().searchByVendorName(venName);
		return result;
	}
	
	
}
