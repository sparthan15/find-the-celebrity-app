package com.celebrity;

import static org.hamcrest.CoreMatchers.any;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.spi.LoggerFactory;

import com.celebrity.domain.Person;
import com.celebrity.domain.Team;

public class Application {

	private static final Logger logger = LogManager.getLogger(Application.class);

	public static void main(String[] args) {
		org.apache.log4j.BasicConfigurator.configure();
		Team anyTeam = new Team(setupPeople());
		logger.info(anyTeam.findTheCelebrities());
	}

	private static Set<Person> setupPeople() {
		Person carlos = new Person("Carlos");
		Person juan = new Person("Juan");
		Person kevin = new Person("Kenvin");
		Person laura = new Person("laura");

		laura.addObserved(kevin);
		carlos.addObserved(kevin);
		juan.addObserved(kevin);
		
		Set<Person> people = new HashSet<>();
		
		people.add(carlos);
		people.add(kevin);
		people.add(juan);
		return people;
	}
}
