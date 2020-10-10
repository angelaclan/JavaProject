package coo.project.build;

import java.util.ArrayList;
import java.util.Arrays;

import coo.project.competition.League;
import coo.project.competition.Tournament;
import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.Match;
import coo.project.match.RandomWinnerMatch;

public class CompetitionBuilder {
	protected Competition competition;
	protected Match match;
	ArrayList<String> someNames = new ArrayList<String>(Arrays.asList("Alex", "Bob", "Chris", "Dylan", "Esteban",
			"Fabio", "Gerard", "Henry", "Isaac", "Jacob", "Kepler", "Lambert", "MrBrown"));

	public CompetitionBuilder forLeague() {
		match = new RandomWinnerMatch();
		competition = new League(match);
		return this;
	}
	
	public CompetitionBuilder forTournament() {
		match = new RandomWinnerMatch();
		competition = new Tournament(match);
		return this;
	}
	
	public CompetitionBuilder addParticipant(String name) {
		Competitor c = new Competitor();
		c.setName(name);
		competition.addCompetitor(c);
		return this;
	}

	public CompetitionBuilder addManyParticipants(int n) {

		for (int i = 0; i < n; i++) {
			this.addParticipant(someNames.get(0));
			someNames.remove(0);
		}
		return this;
	}

	public Competition build() {
		return competition;
	}
}
