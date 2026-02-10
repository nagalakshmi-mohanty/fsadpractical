package com.klu.model;
import org.springframework.stereotype.Component;
public class CourseRegistration{
	@Value("101")
	private int rollNo;
	@Value("Anusha")
	private String studentName;
	@Value("4")
	private int semester;
	
	public CourseRegistration(int no,String name,String sem) {
		rollNo=no;
		studentName=name;
		courseName=cn;
		semester=sem;
	}
	public void display() {
		System.out.println("RollNo:"+rollNo);
		System.out.println("Name:"+studentName);
		System.out.println("");
		
	}
	
}