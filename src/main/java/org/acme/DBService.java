package org.acme;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/employee")
@RegisterRestClient
public interface DBService {

    @GET
    String get();
}
