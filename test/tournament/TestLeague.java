package coo_project.test.tournament;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLeague {

	Competition league;
	Competitor a;
	Competitor b;
	
	@Before
	public void setUp() throws Exception {
		league = new Leauge;
		a = new Competitor();
		b = new Competitor();
		
		league.addCompetitor(a);
		league.addCompetitor(b);
		
		winner = tournemant.play();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertTrue(winner instanceof Competitor);
	}

}
