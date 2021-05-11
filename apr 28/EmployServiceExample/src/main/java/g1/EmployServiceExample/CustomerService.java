package g1.EmployServiceExample;

import java.sql.SQLException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/customer")
public class CustomerService {

	@GET
	@Path("{user}/{pwd}")
	@Produces(MediaType.APPLICATION_JSON)
	public String authenticate(@PathParam("user") String user,
			@PathParam("pwd")	String pwd) throws SQLException {
		String result="";
		CustomerDAO dao = new CustomerDAO();
		int res = dao.authenticate(user, pwd);
		result+=res;
		return result;
	}
}
