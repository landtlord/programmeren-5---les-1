package be.hogent.service.mappers;

import be.hogent.buseniss.PersonEntity;
import be.hogent.service.DTO.Person;

public class PersonMapper extends AbstractMapper<PersonEntity, Person> {
    @Override
    public Person toDTO(PersonEntity personEntity){
        Person person = new Person();

        person.setName(personEntity.getName());
        person.setId(String.valueOf(personEntity.getId()));
        person.setAge(String.valueOf(personEntity.getAge()));

        return person;
    }

    @Override
    public PersonEntity toEntity(Person person){
        PersonEntity personEntity = new PersonEntity();

        personEntity.setName(person.getName());
        personEntity.setId(Long.parseLong(person.getId()));
        personEntity.setAge(Integer.parseInt(person.getAge()));

        return personEntity;
    }


}
