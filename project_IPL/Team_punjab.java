package project_IPL;

public class Team_punjab {

	String teamName ="Kings XI Punjab ";
	String captainName = "SHreyas Iyer";
	int wins = 4;
	int totalMatches = 7;
	double nrr = 7.32;
	int matchesLoss = 3;
	
	void Team_pjb() {
		System.out.println("\nTeam Name : "+ teamName);
		System.out.println("Captain Name : " + captainName);
		
		System.out.println("Total Matches : "+ totalMatches);
		System.out.println("Total matches Win : " + wins);
		System.out.println("Total Matches Loss : "+ matchesLoss);
		
		System.out.println("Net Run Rate : " + nrr);
	}
}
