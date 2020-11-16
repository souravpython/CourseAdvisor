package au.usyd.courseadvisor.Model;

public class User {
  private String username;
  private String password;
  private String firstname;
  private String lastname;
  private String email;
  private String displayFirstName;
  private String displayLastName;
  private String specialisation;
  private String interest;
  private String careerObjective;
  private String occupation;
  private String faculty;
  
  
  // Constructor
  public User(String username, String password, String firstname, String lastname, String email, String displayFirstName, String displayLastName, String specialisation, String interest, String careerObjective, String occupation, String faculty){
	  this.username= username;
	  this.password= password;
	  this.firstname= firstname;
	  this.lastname= lastname;
	  this.email= email;
	  this.displayFirstName= displayFirstName;
	  this.displayLastName= displayLastName;
	  this.specialisation= specialisation;
	  this.interest= interest;
	  this.careerObjective= careerObjective;
	  this.occupation= occupation;
	  this.faculty= faculty;
  }

  public User() {
	// TODO Auto-generated constructor stub
}

public String getUsername() {
  return username;
  }
  
  public void setUsername(String username) {
  this.username = username;
  }
  
  public String getPassword() {
  return password;
  }
  
  public String getFirstname() {
  return firstname;
  }
  
  public void setFirstname(String firstname) {
  this.firstname = firstname;
  }
  
  public String getLastname() {
  return lastname;
  }
  
  public void setLastname(String lastname) {
  this.lastname = lastname;
  }
  
  public String getDisplayFirstName() {
  return displayFirstName;
  }
  public void setDisplayFirstName(String displayFirst) {
  this.displayFirstName = displayFirst;
  }
  
  public String getDisplayLastName() {
  return displayLastName;
  }
  
  public void setDisplayLastName(String displayLast) {
  this.displayLastName = displayLast;
  }
  
  public String getEmail() {
  return email;
  }
  
  public void setEmail(String email) {
  this.email = email;
  }

  public String getSpecialisation() {
  return specialisation;
  }
	
  public void setSpecialisation(String specialisation){
  this.specialisation = specialisation;
  } 
  
  public String getInterest(){
  return interest;
  }

  public void setInterest(String interest) {
  this.interest = interest;
  }
  
  public String getCareerObjective(){
  return careerObjective;
  }
  
  public void setCareerObjective(String objective) {
  this.careerObjective = objective;
  }
  
   public String getOccupation(){
  return occupation;
  }
  
   public String getFaculty(){
  return faculty;
  }
  
  public void setFaculty(String faculty){
   this.faculty = faculty;
  }
}
