package C206_CaseStudy.src;

public class Subjects {
	
	private String subject_id;
	private String subject_name;
	
	public Subjects(String subject_id, String subject_name) {
		super();
		this.subject_id = subject_id;
		this.subject_name = subject_name;
	}
	
	public String getSubjectId() {
		return subject_id;
	}

	public void setSubjectId(String subject_id) {
		this.subject_id = subject_id;
	}

	public String getSubjectName() {
		return subject_name;
	}

	public void setSubjectName(String subject_name) {
		this.subject_name = subject_name;
	}
}
