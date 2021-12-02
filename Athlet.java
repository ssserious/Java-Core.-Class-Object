public class Athlet {
	String name;
	boolean isWin;
	int swinDistance;
	
	public Athlet(String name, int swimDistance) {
		this.name = name;
		this.swimDistance = swimDistance;
		isWin = false;
	}
	
	@Override
	public String toString() {
		return "[" + name + ", " + isWin + ", " + swimDistance +"]"
	}
}