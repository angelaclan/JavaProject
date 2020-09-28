package test.tournament;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestCompetition {
	
	Competition tournemant;
	Competitor a;
	Competitor b;
	Competitor c;
	Competitor d;
	Competitor e;
	Competitor f;
	Competitor winner;
	
	@BeforeEach
	void setUp() throws Exception {
		tournemant = new Tournemant();
		a = new Competitor();
		b = new Competitor();
		c = new Competitor();
		d = new Competitor();
		e = new Competitor();
		f = new Competitor();
		

		tournemant.addCompetitor(a);
		tournemant.addCompetitor(b);
		tournemant.addCompetitor(c);
		tournemant.addCompetitor(d);

		winner = tournemant.play();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWinnerIsCompetitor() {
		Assert.assertTrue(winner instanceof Competitor);
		
		
		
		
	}

}
