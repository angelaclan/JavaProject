package coo.project.objects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

abstract public class Competition {
// Attribute

	protected Match match;
	protected ArrayList<Competitor> competitors = new ArrayList<>();

	protected Boolean hasBeenPlayed = false;

// Constructor
	public Competition(Match match) {
		this.match = match;
	}

// Methods

	public void addCompetitor(Competitor a) {
		competitors.add(a);
	}

	// template method
	public Competitor play() {
		hasBeenPlayed = true;
		return this.play(competitors);
	}

	public ArrayList<Competitor> ranking() {

		ArrayList<Competitor> competitorsSorted = null;
		if (hasBeenPlayed) {
			competitorsSorted = competitors;
			competitorsSorted.sort((c1, c2) -> c2.getPoint().compareTo(c1.getPoint()));
		}
		return competitorsSorted;

	}

	abstract protected Competitor play(ArrayList<Competitor> competitors);

}
