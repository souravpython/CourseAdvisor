package au.usyd.courseadvisor.Model;

public class Course{
	
	private String code;
	private String courseName;
	private String specialisation;
	private String session;
	private int credits;
	private String expertise;
	
	public String getCode() {
    return code;
    }
	
	public void setCode(String code){
    this.code = code;
	}
	
	public String getCourseName() {
    return courseName;
    }
	
	public void setCourseName(String courseName){
    this.courseName = courseName;
	}
	
	public String getSpecialisation() {
    return specialisation;
    }
	
    public void setSpecialisation(String specialisation){
    this.specialisation = specialisation;
	}
	
	public String getSession() {
    return session;
    }

	
	public int getCredits() {
    return credits;
    }
	
	public void setCredits(int credits){
	this.credits = credits;
	}
	
	public String getExpertise() {
    return expertise;
    }
	
	public void setSession(String expertise){
	this.expertise = session;
	}
	
}