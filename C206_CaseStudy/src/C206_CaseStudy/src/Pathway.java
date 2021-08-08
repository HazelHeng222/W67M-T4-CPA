package C206_CaseStudy.src;

public class Pathway {
	private int pathway_id;
	private String pathway;
	
	public Pathway(int pathway_id, String pathway) {
		super();
		this.pathway_id = pathway_id;
		this.pathway = pathway;
	}
	
	public int getPathwayId() {
		return pathway_id;
	}

	public void setSubjectId(int pathway_id) {
		this.pathway_id = pathway_id;
	}

	public String getPathway() {
		return pathway;
	}

	public void setPathwayName(String pathway) {
		this.pathway = pathway;
	}
}
