package C206_CaseStudy.src;

public class Pathway {
	
	private int pathway_id;
	private String pathway_name;
	
	public Pathway(int pathway_id, String pathway_name) {
		super();
		this.pathway_id = pathway_id;
		this.pathway_name = pathway_name;
	}
	
	public int getPathway_id() {
		return pathway_id;
	}
	public void setPathway_id(int pathway_id) {
		this.pathway_id = pathway_id;
	}
	public String getPathway_name() {
		return pathway_name;
	}
	public void setPathway_name(String pathway_name) {
		this.pathway_name = pathway_name;
	}
	
	

}
