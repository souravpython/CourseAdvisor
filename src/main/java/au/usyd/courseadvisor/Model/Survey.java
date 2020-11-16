package au.usyd.courseadvisor.Model;
public class Survey{

	private int surveyId;
	private String code;
	private String feedback;
    private int[] score;
	private double rating;
	private String courseName;
	
	public String getCode() {
    return code;
    }
	
	public void setCode(String code){
    this.code = code;
	}
	
	public int getSurveyId() {
    return surveyId;
    }
	
	public void setSurveyId(int surveyId){
    this.surveyId = surveyId;
	}
	
	public String getFeedback() {
    return feedback;
    }
	
    public void setFeedback(String feedback){
    this.feedback = feedback;
	}
	
	

    public int getScore(int position)
	{
			return this.score[position];
	}
	
    public void setScore(int position, int value)
	{
 
		this.score[position]= value;
 
	}

    public double getRating() {
    return rating;
    }
	
	public void setRating(double rating){
    this.rating = rating;
	}
	
	public String getCourseName() {
    return courseName;
    }
	
	public void setCourseName(String courseName){
    this.courseName = courseName;
	}
	

}