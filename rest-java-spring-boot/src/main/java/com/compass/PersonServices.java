package com.compass;


import com.compass.model.Person;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {
    private final AtomicLong counter = new AtomicLong();
    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findDyId(String id){
        logger.info("Finding one person: " + id);

        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("Henrique");
        person.setLastName("Jornada");
        person.setAdress("Santiago - RS");
        person.setGender("Male");
        return person;
    }

    public Person create(Person person){
        logger.info("creating one personn");
        return person;
    }

    public List<Person> findAll(){
        logger.info("Finding all");
        List<Person> persons= new ArrayList<Person>();
        for(int i=0; i<8; i++){
            Person person = mockPerson(i);
            persons.add(person);
        }
        return persons;
    }

    private Person mockPerson(int i) {
        Person person = new Person();
        person.setId(counter.incrementAndGet());
        person.setFirstName("firstname" + i);
        person.setLastName("lastname" + i);
        person.setAdress("Some adrress in brazil");
        person.setGender("Male");
        return person;
    }

    public Person update(Person person){
        logger.info("updating one personn");
        return person;
    }

    public void delete(String id){
        logger.info("deleting one personn");
    }
}
