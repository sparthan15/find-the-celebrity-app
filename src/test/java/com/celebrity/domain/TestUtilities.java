package com.celebrity.domain;

import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;

public class TestUtilities {

	protected Team xTeam;
	protected Person carlos;
	protected Person juan;
	protected Person kevin;
	protected Person michaelJordan;
	protected Person lionelMessi;
	protected Set<Person> people;

	@BeforeEach
	void setUp() {
		carlos = new Person("Carlos");
		juan = new Person("Juan");
		kevin = new Person("Kenvin");
		lionelMessi = new Person("Lio mesi");
		michaelJordan = new Person("Mike Jordan");

		carlos.addObserved(michaelJordan);
		kevin.addObserved(michaelJordan);
		juan.addObserved(lionelMessi);
		juan.addObserved(michaelJordan);
		//michaelJordan.addObserved(michaelJordan);
		people = new HashSet<>();
		people.add(carlos);
		people.add(kevin);
		people.add(michaelJordan);
		people.add(juan); 
		ICelebrity basketballCelebrity = new BasketballCelebrity();
		xTeam = new Team(people, basketballCelebrity);
	}

}
