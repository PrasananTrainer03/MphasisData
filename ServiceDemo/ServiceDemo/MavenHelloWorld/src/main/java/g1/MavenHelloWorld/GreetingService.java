package g1.MavenHelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/greeting")
public class GreetingService {

	@GET
    @Path("/greet/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String greetMe(@PathParam("name") String name) {
        return "Welcome to " +name;
    }

    @GET 
    @Path("/test/{name}")
    @Produces(MediaType.TEXT_PLAIN)
    public String test(@PathParam("name") String name) {
        return "Hi " +name+ " You take java test next week...";
    }

    @GET
    @Path("/salute/{name}")
    @Produces(MediaType.TEXT_PLAIN) 
    public String salute(@PathParam("name") String name) {
        return "We are done for Today " +name;
    }
}
