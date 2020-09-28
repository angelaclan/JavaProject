package test.tournament;

public class Match {
//	Attribute
	protected Competitor one;
	protected Competitor two;
	protected double randomNum = -1;
	protected boolean hasBeenPlayed = false;

// Constructor
	public Match(Competitor c1, Competitor c2) {
		one = c1;
		two = c2;
	}
	public Competitor getOne() {
		return one;
	}
	public void setOne(Competitor one) {
		this.one = one;
	}
	public Competitor getTwo() {
		return two;
	}
	public void setTwo(Competitor two) {
		this.two = two;
	}
	public Match() {
	}


	//	Methods
	public Competitor theWinnerIs() {
		if (randomNum > 0.5) {
			return one;
		} else {
			return two;
		}
	}
	
	public void play() {
		if (this.hasBeenPlayed())
			return;
		else {
			randomNum = Math.random();
			hasBeenPlayed = true;
		}
	}

	public boolean hasBeenPlayed() {
		return hasBeenPlayed;
	}

}
