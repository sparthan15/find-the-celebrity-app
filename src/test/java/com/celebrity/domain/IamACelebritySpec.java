package com.celebrity.domain;


import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import com.celebrity.domain.utilities.IamACelebrity;

class IamACelebritySpec extends TestUtilities {

	private IamACelebrity iamACelebrity = new IamACelebrity();

	@Test
	void testAnyOneIsNotACelebrity() {
		assertFalse(iamACelebrity.test(carlos, xTeam));
	}

	@Test
	void givenThatIAmAllObservedAndIDoNotKnowAnyBodyThenIamACelebrity() {

		assertTrue(iamACelebrity.test(michaelJordan, xTeam));
	}

	@Test
	void givenThatIHaveNotKnownByAllPeopleThenIAmNotACelebrity() {

		assertFalse(iamACelebrity.test(lionelMessi, xTeam));
	}

}
