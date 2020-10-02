package coo.project.tests;

import org.junit.Assert;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import coo.project.objects.Competition;
import coo.project.objects.Competitor;
import coo.project.objects.Tournament;

class TestTournament {
	
	Competition tournament;
	Competitor a;
	Competitor b;
	Competitor c;
	Competitor d;
	Competitor winner;
	RandomWinnerMatch random;
	@BeforeEach
	void setUp() throws Exception {
		tournament = new Tournament(random);
		a = new Competitor();
		b = new Competitor();
		c = new Competitor();
		d = new Competitor();

		tournament.addCompetitor(a);
		tournament.addCompetitor(b);
		tournament.addCompetitor(c);
		tournament.addCompetitor(d);

		winner = tournament.play();
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testWinnerIsCompetitor() {
		Assert.assertTrue(tournament.competitors.size() == 4);
		
		
		
		
	}

}
