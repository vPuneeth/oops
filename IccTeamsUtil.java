public class IccTeamsUtil {

	public static void main(String[] args) {
		
		IccTeams information = new IccTeams();
		information.teamName = "INDIA";
		information.captain = "VIRAT KOHLI";
		information.headCoach = "RAVI SHASTRI";
		information.totalOdiPlayers = 241;
		System.out.println(information.teamName+"\n"+information.captain+"\n"+information.headCoach+"\n"+information.totalOdiPlayers);
		information.teamInformation();
		
		IccTeams information1 = new IccTeams();
		information1.teamName = "AUSTRALIA";
		information1.captain = "AARON FINCH";
		information1.headCoach = "JUSTIN LANGER";
		information1.totalOdiPlayers = 234;
		System.out.println(information1.teamName+"\n"+information1.captain+"\n"+information1.headCoach+"\n"+information1.totalOdiPlayers);
		information1.teamInformation();
		
		IccTeams information2 = new IccTeams();
		information2.teamName = "NEW ZEALAND";
		information2.captain = "KANE WILLIAMSON";
		information2.headCoach = "GARY STEAD";
		information2.totalOdiPlayers = 239;
		System.out.println(information2.teamName+"\n"+information2.captain+"\n"+information2.headCoach+"\n"+information2.totalOdiPlayers);
		information2.teamInformation();
		
	}

}