package project_IPL;

public class Team_MI {

	String teamName ="Mumbai Indians";
	String captainName = "Hardik pandya";
	int wins = 2;
	int totalMatches = 5;
	double nrr = 20.32;
	int matchesLoss = 3;
	
	void Team_mi() {
		System.out.println("\nTeam Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
	}
}
