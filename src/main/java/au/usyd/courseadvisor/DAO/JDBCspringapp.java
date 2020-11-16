package au.usyd.courseadvisor.DAO;

// Import package

import java.sql.*;
import au.usyd.courseadvisor.Model.User;
import au.usyd.courseadvisor.Model.Course;
import au.usyd.courseadvisor.Model.Survey;
import java.util.ArrayList;

public class JDBCspringapp{
	
		// JDBC Driver	
	final String jdbcDriver= "com.mysql.jdbc.Driver";
	
	    // Database URL
	final String dbURL= "jdbc:mysql://localhost:3306";
	
	   // Database Credentials
	final String usernm= "root";
	final String pswd= "3102";
	
	Connection conc= null;
	Statement stat= null;
	
	// Array List User Setting Page
	ArrayList<User> userList= new ArrayList<User>();
	
	public void createData(){
	try{	  
	  // Register JDBC Driver  
	Class.forName(jdbcDriver);
	 
	   // Open Connection
	System.out.println("Connecting to Database...");
	conc= DriverManager.getConnection(dbURL, usernm, pswd);
	
	  // Execute SQL Queries
	  
	  
	  // Create Database SPRINGAPP
	stat= conc.createStatement();
	String sqlQuery1= "CREATE DATABASE SPRINGAPP";
	stat.executeUpdate(sqlQuery1);
	System.out.println("Database Created");
	
	
	  // Create Table USER
	  
	String sqlQuery2= "CREATE TABLE USER"+
	                  "(username VARCHAR(32) not NULL, "+
					  "password VARCHAR(32) not NULL"+
					  "firstName VARCHAR(32), "+
					  "lastName VARCHAR(32), "+
					  "email VARCHAR(32), "+
					  "displayFirstName VARCHAR(32), "+
					  "displayLastName VARCHAR(32), "+
					  "specialisation VARCHAR(255), "+
					  "interest VARCHAR(255), "+
					  "careerObjective VARCHAR(255), "+
					  "faculty VARCHAR(255), "+
					  "occupation VARCHAR(32)"+
					  "PRIMARY KEY(username))";
					  
	stat.executeUpdate(sqlQuery2);
	System.out.println("Table User Created");
	
	String sqlQuery3= "INSERT INTO USER "+
	                  "VALUES ('sourabh123', 'Sourabh@123', 'Sourabh', 'Sinha', 'ssin6556@uni.sydney.edu.au', 'Sourav', 'Sinha', 'Data Analytics',  'Data Visualisation', 'Data Analyst', 'Masters of IT/IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery3);	

	String sqlQuery4= "INSERT INTO USER "+
	                  "VALUES ('kshitiz123', 'Kshitiz@123', 'Kshitiz', 'Bhargava', 'kbha5940@uni.sydney.edu.au', 'Kshitiz', 'Bhargava', 'Software Engineering',  'Mobile Computing', 'Android Developer', 'Masters of IT/IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery4);
	
	String sqlQuery5= "INSERT INTO USER "+
	                  "VALUES ('fai123', 'Fai@123', 'Jinvara', 'Vesvijak', 'jves0423@uni.sydney.edu.au', 'Fai', 'Vesvijak', 'Software Engineering',  'Web Application', 'Full Stack Developer', 'Masters of IT/IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery5);
	
	String sqlQuery6= "INSERT INTO USER "+
	                  "VALUES ('wang123', 'Wang@123', 'Yetong', 'Wang', 'ywan2540@uni.sydney.edu.au', 'Yetong', 'Wang', 'Software Engineering',  'Web Application', 'Full Stack Developer', 'Masters of IT/IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery6);
	
	String sqlQuery7= "INSERT INTO USER "+
	                  "VALUES ('domi123', 'Domi@123', 'Domi', 'Johnson', 'djoh3615@uni.sydney.edu.au', 'Domi', 'Johnson', 'IT Management', 'Project Management', 'Project Manager', 'Masters of IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery7);
	
	String sqlQuery8= "INSERT INTO USER "+
	                  "VALUES ('test123', 'Test@123', 'Test', 'Test', 'test@uni.sydney.edu.au', 'Test', 'Test', 'Data Security', 'Change Management', 'Change Manager', 'Masters of IT/IT Mgmt', 'Student')";
	stat.executeUpdate(sqlQuery8);
	
	String sqlQuery9= "INSERT INTO USER "+
	                  "VALUES ('test456', 'Test@456', 'Test', 'Test', 'testP@uni.sydney.edu.au', 'Test', 'Test', '', '', '', '', 'Professor')";
	stat.executeUpdate(sqlQuery9);
	
	System.out.println("Records inserted into user table");
	
	// Create table Course
	
	String sqlQuery10= "CREATE TABLE COURSE"+
	                  "(code VARCHAR(32) not NULL, "+
					  "courseName VARCHAR(255) not NULL"+
					  "expertise VARCHAR(255), "+
					  "session VARCHAR(32), "+
					  "credits INTEGER, "+
					  "specialisation VARCHAR(32), "+
					  "PRIMARY KEY(code))";
					  
	stat.executeUpdate(sqlQuery10);		
    System.out.println("Table Course Created");	
	
	String sqlQuery11= "INSERT INTO COURSE"+
	                  "VALUES ('COMP5347', 'Web Application Development', '#web,#JavaScript,#HTML/CSS', 'S2C', 6, 'Software Engineering')";
	stat.executeUpdate(sqlQuery11);
	
	String sqlQuery12= "INSERT INTO COURSE"+
	                  "VALUES ('COMP5349', 'Software Development in Java', '#java,#foundation,#OOP', 'S2C', 6,'Software Engineering')";
	stat.executeUpdate(sqlQuery12);
	
	String sqlQuery13= "INSERT INTO COURSE"+
	                  "VALUES ('INFO5302', 'Database Management Systems', '#SQL,#database,#index', 'S1C', 6, 'Data Analytics')";
	stat.executeUpdate(sqlQuery13);
	
	String sqlQuery14= "INSERT INTO COURSE"+
	                  "VALUES ('INFO5301', 'Information Security Management', '#security,#management,#data', 'S2C', 6, 'Data Security')";
	stat.executeUpdate(sqlQuery14);
	
	String sqlQuery15= "INSERT INTO COURSE"+
	                  "VALUES ('ISYS5070', 'Change Mangement in IT', '#Change Mangement', 'S2C', 6, 'IT Management')";
	stat.executeUpdate(sqlQuery15);
	
		
	String sqlQuery16= "INSERT INTO COURSE"+
	                  "VALUES ('INFO5060', 'Data Analytics and Business Intelligence', '#BI,#DataAnalytics,#Tableu', 'S1NSMA', 6, 'Data Analytics')";
	stat.executeUpdate(sqlQuery16);
	
	String sqlQuery17= "INSERT INTO COURSE"+
	                  "VALUES ('COMP5048', 'Data Visualisation', '#DataAnalytics,#Tableu', 'S2C', 6, 'Data Analytics')";
	stat.executeUpdate(sqlQuery17);
	
	System.out.println("Records inserted into course table");

	
	// Create table Survey
	
	
	String sqlQuery18= "CREATE TABLE SURVEY"+
	                  "(surveyId INTEGER NOT NULL AUTO_INCREMENT, "+
					  "code INTEGER NOT NULL"+
					  "feedback VARCHAR(255), "+
					  "score INTEGER ARRAY[10], "+
					  "rating DOUBLE, "+
					  "specialisation VARCHAR(32), "+
					  "PRIMARY KEY(surveyId))";
					  
	stat.executeUpdate(sqlQuery18);		
    System.out.println("Table Survey Created");	
	
	String sqlQuery19= "INSERT INTO SURVEY"+
	                  "VALUES (100, 'COMP5048', 'Good materials.',{4,4,4,4,4,4,4,4,4,4}, 4.0, 'Data Visualisation')";
	stat.executeUpdate(sqlQuery19);
	
	}
	catch(SQLException se){
      //Errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Errors for Drivers
      e.printStackTrace();
   }finally{
      //Close Resources
      try{
         if(stat!=null)
        	 conc.close();
      }catch(SQLException se){
      }
      try{
         if(conc!=null)
        	 conc.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");
   
	}

public  void updateTableSurvey(int surveyId, String code, String feedback, int[] score, double rating, String courseName){
	
	try{	  
	  // Register JDBC Driver  
	Class.forName(jdbcDriver);
	 
	   // Open Connection
	System.out.println("Connecting to Database...");
	conc= DriverManager.getConnection(dbURL, usernm, pswd);
	
	  // Execute SQL Queries
	  
	stat= conc.createStatement();
	String sqlQuery20= "UPDATE SURVEY SET surveyId= surveyId, code= code, feedback=feedback, score= score, rating=rating, courseName= courseName";
	ResultSet queryResult= stat.executeQuery(sqlQuery20);
	
	
	  }
		catch(SQLException se){
      //Errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Errors for Drivers
      e.printStackTrace();
   }finally{
      //Close Resources
      try{
         if(stat!=null)
        conc.close();
      }catch(SQLException se){
      }
      try{
         if(conc!=null)
        	 conc.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");		
}

public ArrayList<User> displayDetails(){
	
	try{	  
	  // Register JDBC Driver  
	Class.forName(jdbcDriver);
	 
	   // Open Connection
	System.out.println("Connecting to Database...");
	conc= DriverManager.getConnection(dbURL, usernm, pswd);
	
	  // Execute SQL Queries
	
	// Fetch profile details
	stat= conc.createStatement();
	String sqlQuery22= "SELECT * FROM USER WHERE username= userId";
	ResultSet  qr= stat.executeQuery(sqlQuery22);
	
	while(qr.next()){
		String firstnm= qr.getString("firstName");
		String lastnm= qr.getString("lastName");
		String fclty= qr.getString("faculty");
		String spcls= qr.getString("specialisation");
		String mail= qr.getString("email");
		String intrst= qr.getString("interest");
		String co= qr.getString("careerObjective");
		
		// Array List with details for User Settings
		User u= new User(firstnm, lastnm, fclty, spcls, mail, intrst, co, co, co, co, co, co);
		userList.add(u);
		
	}
	
	qr.close(); 	
	  
	}
	

	catch(SQLException se){
      //Errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Errors for Drivers
      e.printStackTrace();
   }finally{
      //Close Resources
      try{
         if(stat!=null)
        	 conc.close();
      }catch(SQLException se){
      }
      try{
         if(conc!=null)
        	 conc.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Goodbye!");		
	
	return userList;
 
	}	
	
}