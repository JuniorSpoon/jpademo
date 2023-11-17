package com.example.jpademo.service;

import com.example.jpademo.entity.PersonEntity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @PersistenceContext
    private EntityManager entityManager;

    @Transactional
    public void personSave(PersonEntity personEntity){
        entityManager.persist(personEntity);
    }

    public PersonEntity getPerson(Integer id) {
        return entityManager.find(PersonEntity.class, id);
    }

    @Transactional
    public void update(Integer id, String name) {
        PersonEntity personEntity = entityManager.find(PersonEntity.class, id);
        personEntity.setFirstName(name);
    }

    @Transactional
    public void delete(Integer id) {
        PersonEntity personEntity = entityManager.find(PersonEntity.class, id);
        entityManager.remove(personEntity);
    }
}
