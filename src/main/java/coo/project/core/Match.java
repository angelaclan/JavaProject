package coo.project.core;
/**
 * 
 * @author Chia-Ling Bragagnolo
 * Match subclass is match resolution strategy, meaning that they are in charge of choosing a winner and scoring.
 */

public abstract class Match {

	
//	Methods

	abstract public Competitor play(Competitor c1, Competitor c2);

}
