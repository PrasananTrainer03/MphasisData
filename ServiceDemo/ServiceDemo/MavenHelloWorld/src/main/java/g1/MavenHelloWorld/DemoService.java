package g1.MavenHelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/demo")
public class DemoService {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayHello() {
        return "Welcome to Rest Services...";
    }
	
	@GET
	@Path("/company")
	@Produces(MediaType.APPLICATION_JSON)
	public String company() {
        return "We are from DXC today...Thank You";
    }
}
