package com.B02_Practice.b02practice;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class PersonApi {
    ArrayList<Person> person = new ArrayList<>();


    @PostMapping ("/person/create")
    public Person createPerson(@RequestBody Person person){
        this.person.add(person);
        return person;
    }




}
