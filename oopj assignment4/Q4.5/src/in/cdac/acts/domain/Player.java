package in.cdac.acts.domain;

public class Player {
	private String name;
	private int age;
	private String team;
	protected int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	@Override
	public String toString() {
		return String.format("%-15s%-5d%-15s%-5d", this.name,this.age,this.team,this.score);
	}
	public void  play() {
		
	}
	
}
