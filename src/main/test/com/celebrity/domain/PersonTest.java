package com.celebrity.domain;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

class PersonTest extends TestUtilities  {

	
	@Test
	void givenImAPersonWhenIBelongToATeamAndIamNotACelebrityThenIknowSomebody() {

		assertFalse(xTeam.findTheCelebrity().contains(carlos));
	}
	
	@Test
	void givenImAPersonWhenIBelongToATeamAndIamACelebrityThenIDoNotknowAnybodyAndAllPeopleKnowMe() {

		assertTrue(xTeam.findTheCelebrity().contains(michaelJordan));
	}
	
}
