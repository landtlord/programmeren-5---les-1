package be.hogent.buseniss.repositories;

import be.hogent.buseniss.PersonEntity;

import java.util.ArrayList;
import java.util.List;

public class PersonRepo {
    private List<PersonEntity> personEntityList;

    public PersonRepo(){
        personEntityList = new ArrayList<PersonEntity>();
    }

    public List<PersonEntity> getAll(){
        return personEntityList;
    }

    public void save(PersonEntity personEntity){
        personEntityList.add(personEntity);
        System.out.println(personEntity);
    }
}
