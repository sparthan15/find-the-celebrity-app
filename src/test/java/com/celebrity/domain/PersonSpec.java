package com.celebrity.domain;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class PersonSpec extends TestUtilities  {

	
	@Test
	void givenImAPersonWhenIBelongToATeamAndIamIknowSomebodyThenIamNotACelebrity() {

		assertFalse(xTeam.findTheCelebrities().contains(carlos));
	}
	
	@Test
	void givenImAPersonWhenIBelongToATeamAndIamACelebrityThenIDoNotknowAnybodyAndAllPeopleKnowMe() {

		assertTrue(xTeam.findTheCelebrities().contains(michaelJordan));
	}
	
}
