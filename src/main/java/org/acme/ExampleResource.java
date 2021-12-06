package org.acme;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;


import org.eclipse.microprofile.rest.client.inject.RestClient;

@Path("/employee")
public class ExampleResource {
   
    @Inject
    @RestClient
     DBService client;

    @GET
     public String message(){
        return client.get();
     }

}