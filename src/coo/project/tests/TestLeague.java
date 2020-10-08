package coo.project.tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import coo.project.objects.CertainWinnerMatch;
import coo.project.objects.Competition;
import coo.project.objects.Competitor;
import coo.project.objects.League;
import coo.project.objects.RandomWinnerMatch;

public class TestLeague {

	Competition league2019;
	Competitor a;
	Competitor b;
	Competitor c;
	
	@Before
	public void setUp() throws Exception {
		league2019 = new League(new CertainWinnerMatch());
		a = new Competitor();
		b = new Competitor();
		c = new Competitor();
		league2019.addCompetitor(a);
		league2019.addCompetitor(b);
		league2019.addCompetitor(c);
		league2019.play();
	}

	@Test
	public void testEachCompetitorHas2Points() {
		Assert.assertTrue(a.getPoint() == 2);
		Assert.assertTrue(b.getPoint() == 2);
		Assert.assertTrue(c.getPoint() == 2);
	}

}
