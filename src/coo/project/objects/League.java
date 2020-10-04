package coo.project.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class League extends Competition {

	public League(Match match) {
		super(match);
	}


// Methods
	
	@Override
	public Competitor play(ArrayList<Competitor> competitors) {
		
		for(int i = 0; i < competitors.size(); i = i + 1) {
			for(int j = 0; j < competitors.size(); j = j + 1) {
				if (i != j) {
					Competitor one, two;
					one = competitors.get(i);
					two = competitors.get(j);
					match.play(one, two);			
				}
			}
				
		}
		ArrayList<Competitor> competitorsSorted = (ArrayList<Competitor>) competitors.clone(); 
		/**
		 *  Competitor -> Competitor -> <-1|0|1>
		 * */
		competitorsSorted.sort((c1, c2) -> c2.getPoint().compareTo(c1.getPoint()));
		return competitorsSorted.get(0);
		
	}

	
}
