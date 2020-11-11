package coo.project.competition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.match.CertainWinnerMatch;

/**
 * 
 * @author Chia-Ling Bragagnolo Tests that each competitor accumulates certain
 *         amount of points after playing the matches. In this test case we
 *         create a special class : CertainWinnerMatch() for test purpose which
 *         the result can be predicted.
 * 
 */
public class TestLeague {

	Competition league2019;
	Competitor a;
	Competitor b;
	Competitor c;

	@BeforeEach
	public void setUp() throws Exception {
		league2019 = new League(new CertainWinnerMatch());
		a = new Competitor("Anne");
		b = new Competitor("Emilie");
		c = new Competitor("Lilia");
		league2019.addCompetitor(a);
		league2019.addCompetitor(b);
		league2019.addCompetitor(c);
		league2019.play();
	}

	@Test
	public void testEachCompetitorHas2Points() {
		Assertions.assertTrue(a.getPoint() == 2);
		Assertions.assertTrue(b.getPoint() == 2);
		Assertions.assertTrue(c.getPoint() == 2);
	}

}
