package coo.project.match;

import coo.project.core.Competitor;
import coo.project.core.Match;
/**
* 
* @author Chia-Ling Bragagnolo
* CertainWinnerMatch gives always one point to the first competitor therefore he is also the winner. 
* 
*/
public class CertainWinnerMatch extends Match{
	
	@Override
	public Competitor play(Competitor c1, Competitor c2) {
		c1.addPoints(1);
		return c1;
	}

}
