package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.PersonDao;
import web.models.Person;

import javax.transaction.Transactional;
import java.beans.Transient;
import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{
    private final PersonDao dao;

    @Autowired
    public PersonServiceImpl(PersonDao dao) {
        this.dao = dao;
    }

    @Transactional
    @Override
    public void savePerson(Person person) {
        this.dao.savePerson(person);
    }

    @Override
    public Person getPersonById(int id) {
        return this.dao.getPersonById(id);
    }

    @Transactional
    @Override
    public void updatePerson(Person person) {
        this.dao.updatePerson(person);
    }

    @Transactional
    @Override
    public void deletePersonById(int id) {
        this.dao.deletePersonById(id);
    }

    @Override
    public List<Person> getAllPeople() {
        return this.dao.getAllPeople();
    }
}
