package be.hogent.service;

import be.hogent.buseniss.PersonEntity;
import be.hogent.buseniss.PersonRepo;
import be.hogent.service.DTO.Person;
import be.hogent.service.mappers.PersonMapper;

import java.util.List;
import java.util.stream.Collectors;

public class PersonService {
    private PersonMapper mapper;

    private PersonRepo repo;

    public PersonService(PersonMapper mapper, PersonRepo repo) {
        this.mapper = mapper;
        this.repo = repo;
    }

    public void save(Person person){
        PersonEntity personEntity = mapper.toEntity(person);
        repo.save(personEntity);
    }

    public List<Person> getAll(){
        List<PersonEntity> personEntities = repo.getAll();

        return mapper.toDTO(personEntities);
    }
}
