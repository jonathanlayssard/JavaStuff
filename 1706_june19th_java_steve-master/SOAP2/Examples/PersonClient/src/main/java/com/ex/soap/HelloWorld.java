package com.ex.soap;

import javax.jws.WebService;

import com.ex.exceptions.PersonNotFoundException;
import com.ex.model.Person;

@WebService
public interface HelloWorld {
    String sayHi(String text);
    String savePerson(Person person);
    Person getPersonByName(String name) throws PersonNotFoundException;
}

