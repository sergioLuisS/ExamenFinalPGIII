package org.example.segundaSerie.repository;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;
import org.example.segundaSerie.model.Person;

@ApplicationScoped
public class PersonRepository implements PanacheRepository<Person> {
}
