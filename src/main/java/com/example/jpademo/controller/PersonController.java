package com.example.jpademo.controller;

import com.example.jpademo.entity.PersonEntity;
import com.example.jpademo.service.PersonService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
@RequiredArgsConstructor
public class PersonController {

    private final PersonService personService;

    @PostMapping
    public void save(@RequestBody PersonEntity personEntity){
        personService.personSave(personEntity);
    }

    @GetMapping("get/{personId}")
    public PersonEntity getPerson(@PathVariable("personId") Integer id){
        return personService.getPerson(id);
    }

    @PutMapping("/update/{personId}/{name}")
    void updateEntity(@PathVariable("personId") Integer id, @PathVariable("name") String name){
        personService.update(id, name);
    }

    @DeleteMapping("/delete/{personId}")
    void deleteCustomer(@PathVariable("personId") Integer id){
        personService.delete(id);
    }
}
