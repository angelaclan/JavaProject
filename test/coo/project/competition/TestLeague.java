package coo.project.competition;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.match.CertainWinnerMatch;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * Tests that each competitor accumulates certain amount of points after playing the matches.
 * In this test case we create a special class : CertainWinnerMatch() for test purpose which the result can be predicted.
 *  
 */
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
