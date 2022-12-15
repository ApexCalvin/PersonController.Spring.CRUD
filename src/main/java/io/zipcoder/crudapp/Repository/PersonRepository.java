package io.zipcoder.crudapp.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.zipcoder.crudapp.Model.Person;

@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}