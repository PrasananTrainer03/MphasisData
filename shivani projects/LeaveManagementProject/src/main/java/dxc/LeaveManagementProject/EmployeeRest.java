package dxc.LeaveManagementProject;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/employee")
public class EmployeeRest {

	@GET
	@Path("/searchemployee/{empno}")
	@Produces(MediaType.APPLICATION_JSON)
	public Employee searchEmploy(@PathParam("empno") int empno) {
		Employee result = new EmployeeDAO().searchEmploy(empno);
		return result;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Employee[] showEmployee() {
		Employee[] result = new EmployeeDAO().showEmploy();
		return result;
	}
}
