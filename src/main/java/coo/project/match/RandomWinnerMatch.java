package coo.project.match;

import java.util.*;

import coo.project.core.Competitor;
import coo.project.core.Match;

/**
 * 
 * @author Chia-Ling Bragagnolo
 * 
 * RandomWinnerMatch scores and select winner based on random probability, 
 * which means each competitor has 0.5 probability to win the match
 */
public class RandomWinnerMatch extends Match {

//	Methods
	
	@Override
	public Competitor play(Competitor c1, Competitor c2) {

		if (getRandomNum() > 0.5) {
			c1.addPoints(1);
			return c1;
		} else {
			c2.addPoints(1);
			return c2;
		}
	}

	private Double getRandomNum() {
		return new Random().nextGaussian();
	}

}
