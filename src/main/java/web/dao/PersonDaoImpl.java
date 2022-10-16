package web.dao;

import org.springframework.stereotype.Component;
import web.models.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class PersonDaoImpl implements PersonDao{
    @PersistenceContext
    private EntityManager entityManager;

    public PersonDaoImpl(){
    }

    @Override
    public void savePerson(Person person) {
        entityManager.persist(person);
    }

    @Override
    public Person getPersonById(int id) {
        return entityManager.find(Person.class, id);
    }

    @Override
    public void updatePerson(Person person) {
        entityManager.merge(person);
    }

    @Override
    public void deletePersonById(int id) {
        Person person = entityManager.find(Person.class, id);
        entityManager.remove(person);
    }

    @Override
    public List<Person> getAllPeople() {
        return entityManager.createQuery("SELECT p FROM Person p", Person.class).getResultList();
    }
}
