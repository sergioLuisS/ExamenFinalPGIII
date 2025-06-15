package org.example.segundaSerie.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.WebApplicationException;
import org.example.segundaSerie.model.Address;
import org.example.segundaSerie.repository.AddressRepository;
import org.example.segundaSerie.repository.PersonRepository;

import java.util.List;

@ApplicationScoped
public class AddressService {

    @Inject
    AddressRepository repository;

    @Inject
    PersonRepository personRepository;

    @Transactional
    public void create(Address address) {
        if (!personRepository.findByIdOptional(address.getPerson().getId()).isPresent()) {
            throw new WebApplicationException("Persona no encontrada", 404);
        }
        repository.persist(address);
    }

    public List<Address> listAll() {
        return repository.listAll();
    }

    public List<Address> findByPersonId(Long personId) {
        return repository.list("person.id", personId);
    }


}

