package be.hogent;

import be.hogent.buseniss.repositories.PersonRepo;
import be.hogent.service.DTO.Person;
import be.hogent.service.PersonService;
import be.hogent.service.mappers.PersonMapper;

public class Runner {
    public static void main(String[] args) {
        PersonRepo personRepo = new PersonRepo();
        PersonMapper personMapper = new PersonMapper();

        PersonService personService = new PersonService(personMapper, personRepo);

        Person person= new Person();

        person.setAge("38");
        person.setId("1");
        person.setName("Andy");

        personService.save(person);

        System.out.println(personService.getAll());
    }
}
