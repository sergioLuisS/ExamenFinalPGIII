package org.example.segundaSerie.repository;


import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.segundaSerie.model.Address;

@ApplicationScoped
public class AddressRepository implements PanacheRepository<Address> {
}
