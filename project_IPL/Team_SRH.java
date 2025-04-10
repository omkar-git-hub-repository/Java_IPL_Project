package project_IPL;

public class Team_SRH {

	String teamName ="Sun Risers Hydrabad";
	String captainName = "Pat Cummins";
	int wins = 3;
	int totalMatches = 4;
	double nrr = 10.32;
	int matchesLoss = 1;
	
	void Team_srh() {
		System.out.println("\nTeam Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
	}
}
