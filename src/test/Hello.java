package test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@Path("/hello")
public class Hello {
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_XML)
	public String sayHello() {
		
		String resource = "<? xml version='1.0' ?>" + 
				"<hello>Hi Jigar, This is Hello from XML</hello>";
		return resource;
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.APPLICATION_JSON)
	public String sayHelloJSON() {
		
		String resource = null;
		return resource;
		
	}
	
	@GET
	@Produces(javax.ws.rs.core.MediaType.TEXT_HTML)
	public String sayHelloHTML() {
		
		String resource = "<h1>Hi Jigar, This is Hello from XML</h1>";
		return resource;
		
	}

}
