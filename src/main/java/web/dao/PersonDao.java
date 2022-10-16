package web.dao;

import web.models.Person;

import java.util.List;

public interface PersonDao {
    void savePerson(Person person);
    Person getPersonById(int id);
    void updatePerson(Person person);
    void deletePersonById(int id);
    List<Person> getAllPeople();
}

