package coo.project.objects;

import coo.project.objects.build.CompetitionBuilder;

public class MainCompetition {
	public static void main(String[] args) {
		
		Competition league2019  = (new CompetitionBuilder()).forLeague().addManyParticipants(8).build();
		league2019.play();
		for (Competitor each : league2019.ranking()) {
			System.out.println(each);
		} 
		
		System.out.println('\n');
		
		Competition tournament2020 = (new CompetitionBuilder()).forTournament().addManyParticipants(8).build();
		tournament2020.play();
		for (Competitor each : tournament2020.ranking()) {
			System.out.println(each);
		} 
			
	}
}
