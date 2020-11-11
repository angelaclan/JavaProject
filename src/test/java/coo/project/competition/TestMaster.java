package coo.project.competition;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import coo.project.build.CompetitionBuilder;
import coo.project.core.Competitor;
import coo.project.match.CertainWinnerMatch;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * Tests that in a master competition, it is able to group players, pick second round players and eventually generates a winner.
 * 
 */
class TestMaster {

	Master master2021;

	@BeforeEach
	void setUp() throws Exception {

		master2021 = (Master) (new CompetitionBuilder()).useMatch(new CertainWinnerMatch()).forPickingWinnersMaster(4)
				.addManyParticipants(16).build();
	}

	@Test
	public void testGotFourSelectedPlayersForProceedFinalRound() {
		Assertions.assertEquals(master2021.calculateLeagues().size(), 4);

	}

	@Test
	public void testTheWinnerIsNotNull() {
		Assertions.assertNotNull(master2021.play());
	}

	@Test
	public void testTheWinnerPickWinnerIsAlwaysTheSame() {
		Assertions.assertEquals(master2021.play(), master2021.play());
	}

	@Test
	public void testTheWinnerPickWinnerIsDifferentWhenPickingLosers() {
		Competitor firstWinner = master2021.play();
		master2021.setStrategy(Master.pickLosers());
		Assertions.assertNotEquals(firstWinner, master2021.play());
	}

}
