package com.celebrity.domain;

import java.util.Set;
import java.util.stream.Collectors;

public class BasketballCelebrity implements ICelebrity {

	@Override
	public boolean test(Person person, Team team) {
		Set<Person> membersWithOutMe = team.getPeople().stream().filter(mySelf -> !mySelf.equals(person))
				.collect(Collectors.toSet());

		return !person.iKnowSomeBody()
				&& membersWithOutMe.stream().allMatch(teamMember -> teamMember.doIknowYou(person));
	}

}
