package com.celebrity.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

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
