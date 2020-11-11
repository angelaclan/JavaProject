package coo.project.build;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import coo.project.competition.League;
import coo.project.competition.Master;
import coo.project.competition.Tournament;
import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.MatchResolutionStrategy;
import coo.project.match.RandomWinnerMatch;

/**
 * @author Chia-Ling Bragagnolo CompetitionBuilder builds a valid competition
 *         according to the message sent.
 * 
 */
public class CompetitionBuilder {
	protected Competition competition;
	protected MatchResolutionStrategy match;
	ArrayList<String> someNames = new ArrayList<String>(Arrays.asList(
			"Alex", "Bob", "Chris", "Dylan", "Esteban",
			"Fabio", "Gerald", "Henry", "Isaac", "Jacob", "Kepler", "Lambert", "MrBrown", "Newton", "Oz", "Pascal", "Rousseau"));

	
	public CompetitionBuilder() {
		match = new RandomWinnerMatch();
	}
	/**
	 * @return CompetitionBuilder Sets League as target competition.
	 */
	public CompetitionBuilder forLeague() {
		competition = new League(match);
		return this;
	}

	/**
	 * @return CompetitionBuilder Sets Tournament as target competition.
	 */
	public CompetitionBuilder forTournament() {
		competition = new Tournament(match);
		return this;
	}

	/**
	 * @return CompetitionBuilder Sets Master as target competition.
	 */
	public CompetitionBuilder forMaster(int playerPerLeague, Function<League, List<Competitor>> strategy) {
		competition = new Master(match, playerPerLeague, strategy);
		return this;
	}

	public CompetitionBuilder forPickingWinnersMaster(int playerPerLeague) {
		this.forMaster(playerPerLeague, Master.pickWinners());
		return this;
	}

	public CompetitionBuilder forPickingLoosersMaster(int playerPerLeague) {
		this.forMaster(playerPerLeague, Master.pickLosers());
		return this;
	}

	public CompetitionBuilder forPickingWinnersAndLoosersMaster(int playerPerLeague) {
		this.forMaster(playerPerLeague, Master.pickWinnersAndLosers());
		return this;

	}

	/**
	 * @param name
	 * @return CompetitionBuilder Adds a single competitor named as given.
	 */
	public CompetitionBuilder addParticipant(String name) {
		Competitor c = new Competitor();
		c.setName(name);
		competition.addCompetitor(c);
		return this;
	}

	/**
	 * @param n
	 * @return CompetitionBuilder Adds a given amount of competitors. Names are
	 *         chosen from a name pool.
	 */
	public CompetitionBuilder addManyParticipants(int n) {

		for (int i = 0; i < n; i++) {
			this.addParticipant(someNames.get(0));
			someNames.remove(0);
		}
		return this;
	}

	/**
	 * @return Competition Returns the built competition
	 */
	public Competition build() {
		return competition;
	}

	public CompetitionBuilder useMatch(MatchResolutionStrategy match) {
		this.match = match;
		if (this.competition != null) {
			this.competition.setMatch(match);
		}
		return this;
	}

	public CompetitionBuilder addAllCompetitors(List<Competitor> competitors) {
		for (Competitor competitor : competitors) {
			this.competition.addCompetitor(competitor);
		}
		return this;
	}

	
}
