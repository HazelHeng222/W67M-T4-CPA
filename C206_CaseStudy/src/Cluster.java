
public class Cluster {
	private int id;
	private String category;
	private String Clustername;
	
	public Cluster(int id, String category, String Clustername) {
		this.id = id;
		this.category = category;
		this.Clustername = Clustername;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}


	public String getCluster() {
		return Clustername;
	}

	public void setCluster(String Clustername) {
		this.Clustername = Clustername;
	}
}

