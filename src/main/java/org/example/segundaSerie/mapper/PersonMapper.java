package org.example.segundaSerie.mapper;

import org.example.segundaSerie.dto.PersonDto;
import org.example.segundaSerie.model.Person;

public class PersonMapper {

    public static PersonDto toDto(Person person) {
        PersonDto dto = new PersonDto();
        dto.id = person.getId();
        dto.name = person.getName();
        return dto;
    }

    public static Person toEntity(PersonDto dto) {
        return new Person(dto.name);
    }
}
