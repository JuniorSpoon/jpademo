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
}
