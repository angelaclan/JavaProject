package coo.project.objects;

import java.util.ArrayList;

import coo.project.tests.RandomWinnerMatch;

public abstract class Competition {
// Attribute
	
	protected Match match;
	final ArrayList<Competitor> competitors = new ArrayList<>();

// Constructor
	public Competition(Match match) {
		this.match = match;
	}
	
// Methods
	abstract public Competitor play(ArrayList<Competitor> competitors);

	public void addCompetitor(Competitor a) {
		competitors.add(a);
	}

	public Competitor play() {
		return this.play(competitors);
	}

}
