package coo.project.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import coo.project.objects.Competition;
import coo.project.objects.Competitor;

public class TestLeague {

	Competition league;
	Competitor a;
	Competitor b;
	
	@Before
	public void setUp() throws Exception {
		league = new League();
		a = new Competitor();
		b = new Competitor();
		
		league.addCompetitor(a);
		league.addCompetitor(b);
		
		winner = league.play();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Assert.assertTrue(winner instanceof Competitor);
	}

}
