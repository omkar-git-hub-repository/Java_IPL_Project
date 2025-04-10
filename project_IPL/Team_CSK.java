package project_IPL;

public class Team_CSK {
	String teamName ="Chennai Super Kings ";
	String captainName = "Ruturaj Gaikwad";
	int wins = 2;
	int totalMatches = 5;
	double nrr = 20.32;
	int matchesLoss = 3;
	
	void Team_csk() {
		System.out.println("Team Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
		
	}
}

