package project_IPL;

public class Team_RCB {
	
	String teamName ="Royal Challengers Benguluru ";
	String captainName = "Virat Kohli";
	int wins = 3;
	int totalMatches = 6;
	double nrr = 24.32;
	int matchesLoss = 3;
	
	 void Team_rcb() {
		System.out.println("\nTeam Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
	}
}
