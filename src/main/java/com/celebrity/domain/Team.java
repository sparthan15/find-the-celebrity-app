package com.celebrity.domain;

import java.util.Set;
import java.util.stream.Collectors;

import com.celebrity.domain.utilities.IamACelebrity;

public class Team {

	private Set<Person> people;
	private ICelebrity whoIsTheCelebrity;

	public Team(Set<Person> people, ICelebrity whoIsTheACelebrity) {
		this.whoIsTheCelebrity = whoIsTheACelebrity;
		this.people = people;
	}

	public Set<Person> getPeople() {
		return this.people;
	}

	public Set<Person> findTheCelebrities() {
		return people.stream().filter(person -> whoIsTheCelebrity.test(person, this)).collect(Collectors.toSet());
	}

}
