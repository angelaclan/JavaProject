package coo.project.objects;
import java.util.ArrayList;

import coo.project.tests.RandomWinnerMatch;


public class Tournament extends Competition {

// Constructor
public Tournament(Match match) {
		super(match);
		// TODO Auto-generated constructor stub
	}


// Methods
	public Competitor play (ArrayList <Competitor> competitors) {
		ArrayList<Competitor> winners = new ArrayList<Competitor>();
		for (int i = 0; i < competitors.size(); i = i+2) {
			Competitor one, two;
			one = competitors.get(i);
			two = competitors.get(i+1);
			match.setOne(one);
			match.setTwo(two);
			match.play();
			winners.add(match.theWinnerIs());
		}
		if (winners.size() != 1) {
			return this.play(winners);			
		}
		return winners.get(0);		
	}

	
}
