package org.example.segundaSerie.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import org.example.segundaSerie.model.Address;
import org.example.segundaSerie.service.AddressService;

import java.util.List;

@Path("/address")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AddressResource {

    @Inject
    AddressService service;

    @POST
    public void create(Address address) {
        service.create(address);
    }

    @GET
    public List<Address> list() {
        return service.listAll();
    }
}

