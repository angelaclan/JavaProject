package coo.project.competition;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.stream.Stream;

import coo.project.build.CompetitionBuilder;
import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.MatchResolutionStrategy;

/**
 * @author Chia-Ling Bragagnolo
 * 
 *         Master resolve winner by having all the competitors playing (first
 *         round) at League then select players for (second round)Tournament
 *         base on the result of the first round.
 * 
 */

public class Master extends Competition {

//Attribute

	int playersPerLeague;
	private Function<League, List<Competitor>> strategy;

// Constructor

	public Master(MatchResolutionStrategy match, int playersPerLeague, Function<League, List<Competitor>> strategy) {
		super(match);
		this.playersPerLeague = playersPerLeague;
		this.strategy = strategy;
	}

//Method
	public void setStrategy(Function<League, List<Competitor>> strategy) {
		this.strategy = strategy;
	}

	@Override
	protected Competitor play(ArrayList<Competitor> competitors) {
		ArrayList<League> leagues = this.calculateLeagues();
		CompetitionBuilder builder = new CompetitionBuilder();
		builder.forTournament().useMatch(match);
		for (League league : leagues) {
			league.play();
			builder.addAllCompetitors(strategy.apply(league));
		}
		return builder.build().play();
	}

	protected ArrayList<League> calculateLeagues() {
		return this.calculateLeagues(competitors);

	}

	protected ArrayList<League> calculateLeagues(ArrayList<Competitor> competitors) {
		ArrayList<League> leagues = new ArrayList<League>();
		int sizeOfLeagues = competitors.size() / this.playersPerLeague;
		Iterator<Competitor> iterator = competitors.iterator();

		for (int i = 0; i < sizeOfLeagues; i++) {
			League league = new League(match);
			for (int j = 0; j < playersPerLeague; j++) {
				if (iterator.hasNext()) {
					league.addCompetitor(iterator.next());
				}
			}
			leagues.add(league);
		}
		return leagues;
	}
	static public Function<League, List<Competitor>> pickWinners() {
		return (League l) -> Arrays.asList(l.ranking().get(0));
	}

	static public Function<League, List<Competitor>> pickLosers() {
		return (League l) -> Arrays.asList(l.ranking().get(l.ranking().size() - 1));
	}

	static public Function<League, List<Competitor>> pickWinnersAndLosers() {
		return (League l) -> Arrays.asList(l.ranking().get(0), l.ranking().get(l.ranking().size() - 1));
	}

}
