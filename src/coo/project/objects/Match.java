package coo.project.objects;

public abstract class Match {
	
//	Attribute
	protected Competitor one;
	protected Competitor two;
	protected boolean hasBeenPlayed = false;

// Constructor
	
	public Match(Competitor c1, Competitor c2) {
		one = c1;
		two = c2;
	}
	public Match() {
	}


	//	Methods
	public abstract Competitor theWinnerIs();
	
	public abstract void play();

	public abstract boolean hasBeenPlayed();
	
	
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
}
