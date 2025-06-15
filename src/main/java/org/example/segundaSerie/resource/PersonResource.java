package org.example.segundaSerie.resource;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.List;
import org.example.segundaSerie.dto.PersonDto;
import org.example.segundaSerie.model.Address;
import org.example.segundaSerie.service.AddressService;
import org.example.segundaSerie.service.PersonService;


@Path("/person")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class PersonResource {

    @Inject
    PersonService service;

    @Inject
    AddressService addressService;

    @GET
    public List<PersonDto> listAll() {
        return service.listAll();
    }

    @POST
    public void create(PersonDto dto) {
        service.create(dto);
    }

    @GET
    @Path("/{id}/addresses")
    public List<Address> getAddresses(@PathParam("id") Long id) {
        return addressService.findByPersonId(id);
    }
}

