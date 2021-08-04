
public class Prerequisite {

	private int id;
	private String subject;
	private String prereuisiteName;
	
	public Prerequisite(int id, String subject, String prereuisiteName) {
		super();
		this.id = id;
		this.subject = subject;
		this.prereuisiteName = prereuisiteName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getPrereuisiteName() {
		return prereuisiteName;
	}

	public void setPrereuisiteName(String prereuisiteName) {
		this.prereuisiteName = prereuisiteName;
	}
	
	
	
}
