package in.cdac.acts.test;

import java.util.Scanner;

import in.cdac.acts.domain.CricketPlayer;
import in.cdac.acts.domain.FootballPlayer;
import in.cdac.acts.domain.Player;

public class PlayerTest {
	private Player [] arr = new Player[2];
	private static Scanner sc =new Scanner(System.in);
	public PlayerTest() {
		arr[0] = new CricketPlayer();
		arr[1] = new FootballPlayer();
	}
	public void acceptRecord() {
		if(arr!=null) {
		for(int index =0;index<this.arr.length;index++) {
			System.out.print("Enter Player Name: ");
			sc.nextLine();
			this.arr[index].setName(sc.nextLine());
			System.out.println("Enter Player Age: ");
			this.arr[index].setAge(sc.nextInt());
			System.out.println("Enter Team: ");
			sc.nextLine();
			this.arr[index].setTeam(sc.nextLine());
			
			if(this.arr[index] instanceof CricketPlayer) {
				CricketPlayer cp = (CricketPlayer)this.arr[index];
				System.out.println("Enter Runs: ");
				
				cp.setRunScored(sc.nextInt());
				System.out.println("Enter Wickets Taken: ");
				cp.setWicketTaken(sc.nextInt());
				
			}
			else {
				FootballPlayer fp = (FootballPlayer) this.arr[index];
				System.out.println("Enter Goals Scored: ");
			
				fp.setGoalScored(sc.nextInt());
				System.out.println("Enter Assists: ");
				fp.setAssists(sc.nextInt());
				
			}
			arr[index].play();
		}
		}
	}
	public static int menuList( ) {
		System.out.println("0.Exit.");
		System.out.println("1.Accept Record.");
		System.out.println("2.Calculate total Score.");
		System.out.println("3.Print Record.");
		System.out.print("Enter choice	:	");
		return sc.nextInt();
	}
	public void calculateTotalScore() {
		int total =0;
		for(Player p:arr) {
			total = total +p.getScore();
		}
		System.out.println("Total : "+total);
	}
	public void printRecord() {
		for(Player p:arr) {
			System.out.println(p.toString());
		}
	}
}
