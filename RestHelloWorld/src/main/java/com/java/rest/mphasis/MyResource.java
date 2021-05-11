package com.java.rest.mphasis;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "This is my First Program in rest Service...Mhasis";
    }
    
    @GET
    @Path("/greeting")
    @Produces(MediaType.TEXT_PLAIN)
    public String greeting() {
    	return "Good Morning to all...";
    }
    
    @GET
    @Path("/topic")
    @Produces(MediaType.TEXT_PLAIN)
    public String topic() {
    	return "Restful Webservice Topic is going on...";
    }
}
