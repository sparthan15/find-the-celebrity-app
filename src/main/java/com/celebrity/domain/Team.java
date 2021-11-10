package com.celebrity.domain;

import java.util.Set;
import java.util.stream.Collectors;

import com.celebrity.domain.utilities.IamACelebrity;

public class Team {

	private Set<Person> people;

	public Team(Set<Person> people) {
		this.people = people;
	}


	public Set<Person> getPeople() {
		return this.people;
	}

	public Set<Person> findTheCelebrity() {
		IamACelebrity iamACelebrity = new IamACelebrity();
		return people.stream().filter(person -> iamACelebrity.test(person, this)).collect(Collectors.toSet());
	}

}
