package C206_CaseStudy.src;

public class Prerequisite {

	private int id;
	private String subject;
	private String prerequisiteName;
	
	public Prerequisite(int id, String subject, String prereuisiteName) {
		super();
		this.id = id;
		this.subject = subject;
		this.prerequisiteName = prereuisiteName;
	}

	public int getPId() {
		return id;
	}

	public void setPId(int id) {
		this.id = id;
	}

	public String getPSubject() {
		return subject;
	}

	public void setPSubject(String subject) {
		this.subject = subject;
	}

	public String getPrerequisiteName() {
		return prerequisiteName;
	}

	public void setPrereuisiteName(String prerequisiteName) {
		this.prerequisiteName = prerequisiteName;
	}
	
	
	
}
