package coo.project.objects.match;

import coo.project.objects.Competitor;
import coo.project.objects.Match;

public class CertainWinnerMatch extends Match{
	
	@Override
	public Competitor play(Competitor c1, Competitor c2) {
		c1.addPoints(1);
		return c1;
	}

}
