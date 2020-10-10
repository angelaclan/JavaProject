package coo.project.build;

import java.util.ArrayList;
import java.util.Arrays;

import coo.project.competition.League;
import coo.project.competition.Tournament;
import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.Match;
import coo.project.match.RandomWinnerMatch;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * 
 * CompetitionBuilder builds a valid competition according to the message sent.
 * 
 */
public class CompetitionBuilder {
	protected Competition competition;
	protected Match match;
	ArrayList<String> someNames = new ArrayList<String>(Arrays.asList("Alex", "Bob", "Chris", "Dylan", "Esteban",
			"Fabio", "Gerard", "Henry", "Isaac", "Jacob", "Kepler", "Lambert", "MrBrown"));

	/**
	 * @return CompetitionBuilder
	 * Sets League as target competition.
	 */
	public CompetitionBuilder forLeague() {
		match = new RandomWinnerMatch();
		competition = new League(match);
		return this;
	}
	/**
	 * @return CompetitionBuilder
	 * Sets Tournament as target competition.
	 */
	public CompetitionBuilder forTournament() {
		match = new RandomWinnerMatch();
		competition = new Tournament(match);
		return this;
	}
	/**
	 * @param name 
	 * @return CompetitionBuilder
	 * Adds a single competitor named as given.
	 */
	public CompetitionBuilder addParticipant(String name) {
		Competitor c = new Competitor();
		c.setName(name);
		competition.addCompetitor(c);
		return this;
	}
	/**
	 * @param n
	 * @return CompetitionBuilder
	 * Adds a given amount of competitors. Names are chosen from a name pool.
	 */
	public CompetitionBuilder addManyParticipants(int n) {

		for (int i = 0; i < n; i++) {
			this.addParticipant(someNames.get(0));
			someNames.remove(0);
		}
		return this;
	}
	/**
	 * @return Competition
	 * Returns the built competition 
	 */
	public Competition build() {
		return competition;
	}
}
