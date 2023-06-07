package com.B02_Practice.b02practice;

import com.sun.net.httpserver.HttpServer;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@SpringBootApplication
@RestController
public class PersonApi {
    ArrayList<Person> person = new ArrayList<>();


    @PostMapping ("/person/create")
    public Person createPerson(@RequestBody Person people){
        person.add(people);
        return people;
    }

    @GetMapping("/person/all")
    public ArrayList<Person> getPerson(){
        return person;
    }

    @PutMapping("/person/update")
    public Person updatePerson(@RequestBody Person updatePerson){
        for(Person person1: person){
            if(person1.getHkid().equals(updatePerson.getHkid())){
                person1.setFirstName(updatePerson.getFirstName());
                person1.setLastName(updatePerson.getLastName());
                return person1;
            }
        }
        throw new NotFoundPeopleException();
    }





}
