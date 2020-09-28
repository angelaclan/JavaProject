package test.tournament;

import java.util.ArrayList;

abstract public class Competition {
// Attribute
	
	final Match match = new Match();
	final ArrayList<Competitor> competitors = new ArrayList<>();

// Constructor
	// public ArrayList<Competitor> competitors;

// Methods
	abstract public Competitor play(ArrayList<Competitor> competitors);

	public void addCompetitor(Competitor a) {
		competitors.add(a);
	}

	public Competitor play() {
		return this.play(competitors);
	}

}
