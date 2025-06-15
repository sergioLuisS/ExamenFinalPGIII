package org.example.segundaSerie.service;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import org.example.segundaSerie.dto.PersonDto;
import org.example.segundaSerie.mapper.PersonMapper;
import org.example.segundaSerie.model.Person;
import org.example.segundaSerie.repository.PersonRepository;

import java.util.List;
import java.util.stream.Collectors;

@ApplicationScoped
public class PersonService {

    @Inject
    PersonRepository repository;

    @Transactional
    public Person create(Person person) {
        repository.persist(person);
        return person;
    }

    public List<PersonDto> listAll() {
        return repository.listAll().stream()
                .map(PersonMapper::toDto)
                .collect(Collectors.toList());
    }

    @Transactional
    public void create(PersonDto dto) {
        Person person = PersonMapper.toEntity(dto);
        repository.persist(person);
    }
}

