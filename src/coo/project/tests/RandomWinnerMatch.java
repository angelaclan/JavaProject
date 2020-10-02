package coo.project.tests;

import coo.project.objects.Competitor;
import coo.project.objects.Match;

public class RandomWinnerMatch extends Match {

	
// Constructor	
	public RandomWinnerMatch(Competitor c1, Competitor c2) {
		super(c1,c2);
	}
	

//	Methods
	public Competitor theWinnerIs() {
		if (getRandomNum() > 0.5) {
			return one;
		} else {
			return two;
		}
	}
	public void play() {
		if (this.hasBeenPlayed())
			return;
		else {
			setRandomNum(Math.random());
			hasBeenPlayed = true;
		}
	}
	public boolean hasBeenPlayed() {
		return hasBeenPlayed;
	}
	
	public void setRandomNum(double random) {
		// TODO Auto-generated method stub
		
	}
	public double getRandomNum() {
		// TODO Auto-generated method stub
		return 0;
	}

		
}
