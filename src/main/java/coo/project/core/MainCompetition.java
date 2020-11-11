package coo.project.core;

import coo.project.build.CompetitionBuilder;
import coo.project.match.CertainWinnerMatch;

/**
 * 
 * @author Chia-Ling Bragagnolo
 * 
 *         Program example
 *
 */

public class MainCompetition {
	public static void main(String[] args) {

		Competition league2019 = (new CompetitionBuilder()).forLeague().addManyParticipants(8).build();
		System.out.println("League Winner: ");
		System.out.println(league2019.play().getName());
		System.out.println("Ranking: ");
		for (Competitor each : league2019.ranking()) {
			System.out.println(each);
		}

		System.out.println('\n');
	
		Competition tournament2020 = (new CompetitionBuilder()).forTournament().addManyParticipants(8).build();
		System.out.println("Tournament Winner: ");
		System.out.println(tournament2020.play().getName());
		System.out.println("Ranking: ");
		for (Competitor each : tournament2020.ranking()) {
			System.out.println(each);
		}

		System.out.println('\n');

		
		Competition master2020 = (new CompetitionBuilder()).forPickingWinnersMaster(4).addManyParticipants(16).build();
		System.out.println("Masters Winner: ");
		System.out.println(master2020.play().getName());
		System.out.println("Ranking: ");
		master2020.play();
		for (Competitor each : master2020.ranking()) {
			System.out.println(each);
		}

	}
}
