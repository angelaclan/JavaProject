package coo.project.competition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.match.CertainWinnerMatch;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * Tests that in a tournament competition, it eventually generates a winner after playing all the matches,
 * who also obtains points that equals to the rounds he has won.
 * In this test case we create a special class : CertainWinnerMatch() for test purpose which the result can be predicted.
 *  
 */
class TestTournament {
	
	Competition tournament2020;
	Competitor a;
	Competitor b;
	Competitor c;
	Competitor d;	
	
	@BeforeEach
	void setUp() throws Exception {
		
		tournament2020 = new Tournament(new CertainWinnerMatch() );
		
		a = new Competitor("Toto");
		b = new Competitor("Tutu");
		c = new Competitor("Tata");
		d = new Competitor("Titi");
		tournament2020.addCompetitor(a);
		tournament2020.addCompetitor(b);
		tournament2020.addCompetitor(c);
		tournament2020.addCompetitor(d);
		tournament2020.play();
		
	}


	@Test
	void testTheWinnerHas2Points() {
		Assertions.assertTrue(a.getPoint() == 2);		
	}
	
	@Test
	void testTheWinnerIsA () {
		Competitor top = tournament2020.ranking().get(0);
		Assertions.assertSame(top, a);		
	}
}
