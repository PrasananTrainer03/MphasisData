package org.hib.rest.mphasis;

import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.NotFoundException;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/employ")
public class EmployService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employ[] showEmploy() throws SQLException {
		EmployDao dao = new EmployDao();
		Employ[] result = dao.showEmploy();
		return result;
	}
	
	@POST
	  @Path("/employInsert/")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String insertEmploy(final Employ e) {
	    String s = new EmployDao().addEmploy(e);
	    System.out.println(s);
	    return s;
	  }

		@GET
		@Path("{id}")
		@Produces(MediaType.APPLICATION_JSON)
		public Employ employeeListById(@PathParam("id") int id) {
		  Employ empl = new EmployDao().search(id);
		  if (empl == null) {
			throw new NotFoundException("No such Employee ID: " + id);
		  }
		  return empl;
		}
}
