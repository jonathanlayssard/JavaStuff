
package com.ex.soap;

import javax.jws.WebService;

import com.ex.exceptions.PersonNotFoundException;
import com.ex.model.Person;

@WebService(endpointInterface = "com.ex.soap.HelloWorld")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }

	@Override
	public String savePerson(Person person) {
		return person.getName()+" saved successfully.";
	}

	@Override
	public Person getPersonByName(String name) throws PersonNotFoundException {
		if(name.equals("john")){
			return new Person("john", 31);
		}else{
			throw new PersonNotFoundException("Person with name of " + name + " was not found.");
		}
	}


}

