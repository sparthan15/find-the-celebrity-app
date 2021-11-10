package com.celebrity.domain;

import java.util.HashSet;
import java.util.Set;

public class Person {

	private String name;

	public Person(String name) {
		this.name = name;
		this.observed = new HashSet<>();
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	private Set<Person> observed;

	 

	public boolean doIknowYou(Person person) {
		return observed.contains(person);
	}

	public void addObserved(Person person) {
		observed.add(person);
	}

	public boolean iKnowSomeBody() {
		return !this.observed.isEmpty();
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}

}
