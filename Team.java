**
* Java Core. Lesson 1
*@author Sergey Sergeev
*@version 01.12.2021
*/

public class Team  {
	String name;
	Athlet[] athlets = new Athlet[4];

	public Team(String name, Athlet athlet1, Athlet athlet2, Athlet athlet3, Athlet athlet4) {
		this.name = name;
		athlets[0] = athlet1;
		athlets[1] = athlet2;
		athlets[2] = athlet3;
	    athlets[3] = athlet4;
	}
	
	public void showInfoAboutAllAthlets() {
		for (Athlet athlet: athlets) {
			System.out.println(athlet);
		}
	}
	
	public void showInfoAboutAllAthlets() {
		for (Athlet athlet: athlets) {
			if (athlet.isWin) {
				System.out.println(athlet);
			}
		}
		
		
		
		