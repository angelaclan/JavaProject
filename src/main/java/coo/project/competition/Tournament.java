package coo.project.competition;
import java.util.ArrayList;

import coo.project.core.Competition;
import coo.project.core.Competitor;
import coo.project.core.Match;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * 
 * Tournament resolve its winner by eliminating players in each round of match.
 */

public class Tournament extends Competition {

// Constructor
	public Tournament(Match match) {
		super(match);
	}


// Methods
	
	@Override
	public Competitor play (ArrayList <Competitor> competitors) {
		ArrayList<Competitor> winners = new ArrayList<Competitor>();
		for (int i = 0; i < competitors.size(); i = i+2) {
			Competitor one, two;
			one = competitors.get(i);
			two = competitors.get(i+1);
			winners.add(match.play(one,two));
		}
		if (winners.size() != 1) {
			return this.play(winners);			
		}
		return winners.get(0);		
	}	
}
