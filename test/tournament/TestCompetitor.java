package test.tournament;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompetitor {
	Competitor ruben;
	Competitor cliffland;
	Match match;

	@BeforeEach
	void setUp() throws Exception {
		ruben = new Competitor();  
		cliffland = new Competitor();
		match = new Match(cliffland, ruben);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testMatchHasTwoCorrespondentCompetitors() {
		
	}

}
