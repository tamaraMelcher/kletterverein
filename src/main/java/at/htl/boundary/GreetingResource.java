package at.htl.boundary;

import at.htl.entity.Climber;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class GreetingResource {

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return "Hello RESTEasy";
    }

    @GET
    @Path("{id}")
    public Climber find(@PathParam("id") long id) {
        return new Climber("Alina" + id, 17);
    }
}