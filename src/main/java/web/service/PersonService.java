package web.service;

import web.models.Person;
import java.util.List;

public interface PersonService {
    void savePerson(Person person);
    Person getPersonById(int id);
    void updatePerson(Person person);
    void deletePersonById(int id);
    List<Person> getAllPeople();
}
