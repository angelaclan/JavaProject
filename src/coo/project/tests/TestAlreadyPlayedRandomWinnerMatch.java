package coo.project.tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import coo.project.objects.Competitor;
import coo.project.objects.Match;
// setup -> test -> teardown
class TestAlreadyPlayedRandomWinnerMatch {
	Match match1 ;
	
	@BeforeEach
	public void setUp() throws Exception {
		match1 = new RandomWinnerMatch(new Competitor(), new Competitor());
		match1.play();
	}

	@Test
	public void testMatchHasBeenPlayed() {
		Assert.assertTrue(match1.hasBeenPlayed());
	}
	
	@Test
	public void testMatchIsWonByCompetitor1WhenProbabilityBiggerThan05() {
		if ( match1.getRandomNum() > 0.5) {
			Assert.assertEquals(match1.getOne(), match1.theWinnerIs());
		} else {
			Assert.assertNotEquals(match1.getOne(), match1.theWinnerIs());
		}
	}
	@Test
	public void testMatchIsWonByCompetitor2WhenProbabilitySmallerThan05() {
		if ( match1.getRandomNum() > 0.5) {
			Assert.assertNotEquals(match1.getTwo(), match1.theWinnerIs());
		} else {
			Assert.assertEquals(match1.getTwo(), match1.theWinnerIs());
		}
	}
}
