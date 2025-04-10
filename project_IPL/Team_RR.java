package project_IPL;

public class Team_RR {
	String teamName ="Rajasthan Royals ";
	String captainName = "Sanju Samson";
	int wins = 2;
	int totalMatches = 4;
	double nrr = 10.32;
	int matchesLoss = 2;
	
	void Team_rr() {
		System.out.println("\nTeam Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
	}
}
