package coo.project.core;

import java.util.ArrayList;

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

	/**
	 * 
	 * @param a
	 * adds the given competitor to the competition
	 */
	public void addCompetitor(Competitor a) {
		competitors.add(a);
	}
	
	/**
	 * 
	 * @return the winner of the competition
	 * template method that relies on play(competitors) defined by sub-classes
	 * 
	 */
	public Competitor play() {
		hasBeenPlayed = true;
		return this.play(competitors);
	}
	/**
	 * 
	 * @return a list of competitors ordered by their gained points
	 * 
	 */
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
