package g1.MavenHelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/employ")
public class EmployService {

	@GET
	@Path("/show")
	@Produces(MediaType.APPLICATION_JSON)
	public Employ employeeListById() {
		Employ employ = new Employ(1, "Raj", 48256);
		return employ;
	}
}
