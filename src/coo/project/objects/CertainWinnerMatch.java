package coo.project.objects;

public class CertainWinnerMatch extends Match{
	
	@Override
	public Competitor play(Competitor c1, Competitor c2) {
		c1.addPoints(1);
		return c1;
	}

}
