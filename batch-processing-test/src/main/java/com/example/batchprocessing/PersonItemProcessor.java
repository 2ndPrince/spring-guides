package com.example.batchprocessing;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.batch.item.ItemProcessor;

public class PersonItemProcessor implements ItemProcessor<Person, Person> {

    private static final Logger log = LoggerFactory.getLogger(PersonItemProcessor.class);

    @Override
    public Person process(final Person person) throws Exception {
    	if(person.getIsActive()) {
    		final String firstName = person.getFirstName().toUpperCase();
            final String lastName = person.getLastName().toUpperCase();
            final Boolean isActive = person.getIsActive();
            final String date = person.getCreatedTS(); 

            final Person transformedPerson = new Person(firstName, lastName, isActive, date);

            log.info("Converting (" + person + ") into (" + transformedPerson + ")");

            return transformedPerson;
    	}
    	return person;
        
    }

}
