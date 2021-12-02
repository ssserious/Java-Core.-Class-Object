public class Main {
	public static void main(String[] args)  {
		Athlet athlet1 = new Athlet(name: "user1", swimDistence: 150);
		Athlet athlet2 = new Athlet(name: "user2", swimDistence: 250);
		Athlet athlet3 = new Athlet(name: "user3", swimDistence: 100);
		Athlet athlet4 = new Athlet(name: "user4", swimDistence: 45);
		Team team = new Team( name: "Juve", athlet1, athlet2, athlet3, athlet4);
		Course course = new Course(50, 100, 150, 200);

        team.showInfoAboutAllAthlets();	
        System.out.println();
        course.doIt(team);		
	    team.showInfoAboutWinners();	
	}
}