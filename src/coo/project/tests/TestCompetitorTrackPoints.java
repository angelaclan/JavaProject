package coo.project.tests;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coo.project.objects.CertainWinnerMatch;
import coo.project.objects.Competitor;
import coo.project.objects.Match;
import coo.project.objects.RandomWinnerMatch;
// setup -> test -> teardown

class TestCompetitorTrackPoints {
	CertainWinnerMatch match1 ;
	CertainWinnerMatch match2 ;
	Competitor a;
	Competitor b;
	Competitor c; 
	
	@BeforeEach
	public void setUp() throws Exception {
		a = new Competitor();
		b = new Competitor();
		match1 = new CertainWinnerMatch();
		match2 = new CertainWinnerMatch();
		match1.play(a, b);
		match2.play(a, c);
		
	}

	
	@Test
	
	public void testWinnerAHasTwoPointsAfterSecondMatch() {
		Assert.assertTrue(a.getPoint() == 2);
		
	}
	
	
}
