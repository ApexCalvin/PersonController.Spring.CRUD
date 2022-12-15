package io.zipcoder.crudapp.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.zipcoder.crudapp.Repository.PersonRepository;
import io.zipcoder.crudapp.Model.Person;

@Service
public class PersonService {

    @Autowired
    private PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Iterable<Person> index() { //getAllPersons
        return repository.findAll();
    }

    public Person create(Person person) {
        return repository.save(person);
    }

    public Person read(Long id) {
        return repository.findOne(id);
    }

    public Person update(Long id, Person nPersonData) {
        Person originalPerson = repository.findOne(id);
        originalPerson.setFirstName(nPersonData.getFirstName());
        originalPerson.setLastName(nPersonData.getLastName());
        return repository.save(originalPerson);
    }

    public Boolean delete(Long id) {
        repository.delete(id);
        return true;
    }
    
}