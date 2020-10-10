package coo.project.competition;

import java.util.ArrayList;

import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.Match;

/**
 * 
 * @author Chia-Ling Bragagnolo
 * 
 *         League resolve its winner by having all the competitors playing
 *         against all the competitors.
 */
public class League extends Competition {

	public League(Match match) {
		super(match);
	}

// Methods

	@Override
	protected Competitor play(ArrayList<Competitor> competitors) {

		for (int i = 0; i < competitors.size(); i = i + 1) {
			for (int j = 0; j < competitors.size(); j = j + 1) {
				if (i != j) {
					Competitor one, two;
					one = competitors.get(i);
					two = competitors.get(j);
					match.play(one, two);
				}
			}
		}

		return this.ranking().get(0);

	}
}
