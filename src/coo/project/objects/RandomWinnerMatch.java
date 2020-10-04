package coo.project.objects;
import java.util.*;


public class RandomWinnerMatch extends Match {

	

//	Methods
	@Override
	public Competitor play(Competitor c1, Competitor c2) {
		
		if (setRandomNum() > 0.5) {
			c1.addPoints(1);
		return c1;
		} else {
			c2.addPoints(1);
		return c2;
		}
	}
	
	
	public int setRandomNum() {
		Random rand = new Random();
		return rand.nextInt(2);
	}
	

		
}
