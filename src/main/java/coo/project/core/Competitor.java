package coo.project.core;

public class Competitor {

//Attribute

	private String name;
	private Integer point = 0;
	
// Constructor
	public Competitor (String name) {
		this.name = name;
	}
	

// Methods
	/**
	 * 
	 * @param pt
	 * add points to the winner of a match
	 */
	public void addPoints(int pt) {
		this.point = point + pt;
	}

	/**
	 * 
	 * @return the name of a competitor
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return the points of a competitor
	 */
	public Integer getPoint() {
		return point;
	}

	@Override
	public String toString() {

		return name + ":" + point.toString();
	}
}
