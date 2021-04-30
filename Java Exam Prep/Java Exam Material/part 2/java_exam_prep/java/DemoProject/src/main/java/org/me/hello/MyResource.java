package org.me.hello;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Root resource (exposed at "myresource" path)
 */
@Path("sol")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */

    @GET 
    @Path("/sum/{i}/{j}") 
    @Produces(MediaType.TEXT_PLAIN) 
    public String sum(@PathParam("i") int i, @PathParam("j") int j) {
        int c=i+j;
        return "Sum is  " +c;
    }

    @GET 
    @Path("/PosNeg/{i}") 
    @Produces(MediaType.APPLICATION_JSON) 
    public String sayPosNeg(@PathParam("i") int i) {
        if (i >= 0) {
            return "Positive No...";
        }
        else {
            return "Negative No...";
        }
    }

    @GET 
    @Path("/EvenOdd/{i}") 
    @Produces(MediaType.APPLICATION_JSON) 
    public String sayEvenOdd(@PathParam("i") int i) {
        if(i%2==0){
            return "Even Number...";
        }
        else {
            return "Odd Number...";
        }
    }
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Welcome to REST Services...";
    }

    @GET 
    @Path("/project")
    @Produces(MediaType.TEXT_PLAIN) 
    public String project() {
        return "Project for Sol...Rest Services...";
    }
    @GET 
    @Path("/trainer") 
    @Produces(MediaType.TEXT_PLAIN) 
    public String greeting() {
        return "Class By Prasanna...";
    }

    @GET 
    @Path("/student")
    @Produces(MediaType.TEXT_PLAIN) 
    public String student() {
        return "Hi I am Sol";
    }
}
