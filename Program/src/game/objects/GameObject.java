package game.objects;

public class GameObject implements Comparable<GameObject> {
	private int id;
	private String name;
	
	// @formatter:off
	
	private int[][] comparison = {
			//				rock 	paper 		scissors
			/*rock */		{  0,     -1,         1     },
			/*paper*/		{  1, 	  0,	     -1     },
			/*scissor*/		{  -1,    1,          0     }
	};
	
	// @formatter:on
	
	public int compareTo(GameObject other) {
		return comparison[id][other.id];
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return name;
	}
	
	
	
}
