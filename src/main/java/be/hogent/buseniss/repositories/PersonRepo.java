package be.hogent.buseniss.repositories;

import be.hogent.buseniss.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonRepo {
    private List<PersonEntity> personList;

    public PersonRepo(){
        personList = new ArrayList<PersonEntity>();
    }

    public List<PersonEntity> getAll(){
        return personList;
    }

    public void save(PersonEntity personEntity){
        personList.add(personEntity);
        System.out.println(personEntity);
    }
}
