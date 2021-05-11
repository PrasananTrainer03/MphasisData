package g1.EmployServiceExample;

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
		EmployDAO dao = new EmployDAO();
		Employ[] result = dao.showEmploy();
		return result;
	}

	@GET
	@Path("{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ employeeListById(@PathParam("empno") int empno) throws SQLException {
	  Employ empl = new EmployDAO().searchEmploy(empno);
	  if (empl == null) {
		throw new NotFoundException("No such Employee ID: " + empno);
	  }
	  return empl;
	}
	
	  @POST
	  @Path("/employInsert/")
	  @Consumes(MediaType.APPLICATION_JSON)
	  @Produces(MediaType.APPLICATION_JSON)
	  public String insertEmploy(final Employ e) {
	    String s = new EmployService().insertEmploy(e);
	 //   System.out.println(s);
	    return s;
	  }

}
