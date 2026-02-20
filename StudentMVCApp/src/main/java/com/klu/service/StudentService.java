package com.klu.service;
import com.klu.model.Student;
public interface StudentService {
	String getWelcomeMessage();
	String getStudentById(int id);
	String searchStudent(String name,String course);
	String createStudent(Student student);
	String enrollStudent(int id,Student student);

}
