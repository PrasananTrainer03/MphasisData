package com.dxc.cms;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/wallet")
public class WalletRest {

	 @GET
	  @Path("/{custId}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Wallet[] showWalletInfo(@PathParam("custId") int custId) throws SQLException {
			Wallet[] result = new WalletDAO().showByCustomerId(custId);
			return result;
	  }
	 
	 @GET
	  @Path("/{custId}/{waltype}")
	  @Produces(MediaType.APPLICATION_JSON)
	  public Wallet showWalletTypeInfo(@PathParam("custId") int custId,
			  @PathParam("waltype") String waltype) throws SQLException {
			Wallet result = new WalletDAO().showByWalltType(custId, waltype);
			return result;
	  }
}
