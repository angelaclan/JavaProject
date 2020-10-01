package test.tournament;
import java.util.ArrayList;


public class Tournemant extends Competition {
	
	

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
