package in.cdac.acts.domain;

public class CricketPlayer extends Player {
	private int runScored;
	private int wicketTaken;
	public int getRunScored() {
		return runScored;
	}
	public void setRunScored(int runScored) {
		this.runScored = runScored;
	}
	public int getWicketTaken() {
		return wicketTaken;
	}
	public void setWicketTaken(int wicketTaken) {
		this.wicketTaken = wicketTaken;
	}
	@Override
	public void  play() {
		this.score = this.runScored + this.wicketTaken*10;
		
	}
	
}
