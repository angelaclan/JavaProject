package coo.project.objects;
import java.util.ArrayList;


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
