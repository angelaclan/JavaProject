package coo.project.core;

public class Competitor {

//Attribute

	private String name;
	private Integer point = 0;

// Methods

	public void addPoints(int pt) {
		this.point = point + pt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getPoint() {
		return point;
	}

	public void setPoint(Integer point) {
		this.point = point;
	}

	@Override
	public String toString() {

		return name + ":" + point.toString();
	}
}
