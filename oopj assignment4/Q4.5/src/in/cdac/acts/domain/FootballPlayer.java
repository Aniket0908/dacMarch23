package in.cdac.acts.domain;

public class FootballPlayer extends Player {
	private int goalScored;
	private int assists;
	public int getGoalScored() {
		return goalScored;
	}
	public void setGoalScored(int goalScored) {
		this.goalScored = goalScored;
	}
	public int getAssists() {
		return assists;
	}
	public void setAssists(int assists) {
		this.assists = assists;
	}
	@Override
	public void  play() {
	this.score = this.goalScored + this.assists*5;
		
	}
}
