package test.tournament;



import org.junit.Assert;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
// setup -> test -> teardown
class TestAlreadyPlayedMatch {
	Match match1 ;
	
	@BeforeEach
	void setUp() throws Exception {
		match1 = new Match(new Competitor(), new Competitor());
		match1.play();
	}

	@Test
	void testMatchHasBeenPlayed() {
		Assert.assertTrue(match1.hasBeenPlayed());
	}
	
	@Test
	void testMatchIsWonByCompetitor1WhenProbabilityBiggerThan05() {
		if ( match1.randomNum > 0.5) {
			Assert.assertEquals(match1.one, match1.theWinnerIs());
		} else {
			Assert.assertNotEquals(match1.one, match1.theWinnerIs());
		}
	}
	@Test
	void testMatchIsWonByCompetitor2WhenProbabilitySmallerThan05() {
		if ( match1.randomNum > 0.5) {
			Assert.assertNotEquals(match1.two, match1.theWinnerIs());
		} else {
			Assert.assertEquals(match1.two, match1.theWinnerIs());
		}
	}
}
