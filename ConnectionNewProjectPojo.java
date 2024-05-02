package com.connectionnewproject.www;

public class ConnectionNewProjectPojo {

	int Student_id;
	String Student_name;
	String Student_department;
	String Student_location;
	public int getStudent_id() {
		return Student_id;
	}
	public void setStudent_id(int student_id) {
		Student_id = student_id;
	}
	public String getStudent_name() {
		return Student_name;
	}
	public void setStudent_name(String student_name) {
		Student_name = student_name;
	}
	public String getStudent_department() {
		return Student_department;
	}
	public void setStudent_department(String student_department) {
		Student_department = student_department;
	}
	public String getStudent_location() {
		return Student_location;
	}
	public void setStudent_location(String student_location) {
		Student_location = student_location;
	}
	public ConnectionNewProjectPojo(int student_id, String student_name, String student_department,
			String student_location) {
		super();
		Student_id = student_id;
		Student_name = student_name;
		Student_department = student_department;
		Student_location = student_location;
	}
	public ConnectionNewProjectPojo() {
		super();
		
	}
	
	
	
}
