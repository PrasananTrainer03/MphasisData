package org.hib.rest.mphasis;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
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
}
