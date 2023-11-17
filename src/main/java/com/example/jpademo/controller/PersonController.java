package com.example.jpademo.controller;

import com.example.jpademo.entity.PersonEntity;
import com.example.jpademo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void save(@RequestBody PersonEntity personEntity){
        personService.personSave(personEntity);
    }
}
