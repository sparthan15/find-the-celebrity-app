package com.celebrity.domain.utilities;

import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

import com.celebrity.domain.Person;
import com.celebrity.domain.Team;

public class IamACelebrity implements BiPredicate<Person, Team> {

	@Override
	public boolean test(Person person, Team team) {

		Set<Person> membersWithOutMe = team.getPeople().stream().filter(mySelf -> !mySelf.equals(person))
				.collect(Collectors.toSet());

		return !person.iKnowSomeBody()
				&& membersWithOutMe.stream().allMatch(teamMember -> teamMember.doIknowYou(person));
	}

}
