package coo.project.match;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coo.project.core.Competitor;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * Tests that competitor can track his points after winning some matches, the points of each competitor is equal to the rounds they have won.
 * In this test case we create a special class : CertainWinnerMatch() for test purpose which the result can be predicted.
 *  
 */
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
