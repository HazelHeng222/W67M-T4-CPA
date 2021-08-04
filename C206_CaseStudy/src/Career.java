package C206_CaseStudy.src;


public class Career {
  
    private int career_id;
    private String career_name;

    public Career(int career_id, String career_name) {
        super();
        this.career_id = career_id;
        this.career_name = career_name;
    }

    public int getCareerID() {
        return career_id;
    }

    public void setCareerID(int career_id) {
        this.career_id = career_id;
    }

    public String getCareerName() {
        return career_name;
    }

    public void setCareerName(String career_name) {
        this.career_name = career_name;
    }

}

