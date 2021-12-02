public class Course {
	int[] obstacles = new int[4];

    public Course(int obstacle1, obstacle2, obstacle3, obstacle4) {
		obstacles[0] = obstacle1;
	    obstacles[1] = obstacle2;
	    obstacles[2] = obstacle3;
	    obstacles[3] = obstacle4;
    }
	
    public void doIt(Team team){
        for (Athlet athlet : team.athlets) {
			for (int distance: obstacles)  {
                if (athlet.swimDistance >= distance) {
				    athlet.isWin = true;	
				}
				else {
					athlet.isWin = false;
					break;
				}
			}
		}
	}
}
					
                
        
    
