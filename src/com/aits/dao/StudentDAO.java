package com.aits.dao;

import java.util.List;

import com.aits.model.EducationDetails;
import com.aits.model.Student;

public interface StudentDAO {
	public List<Student> getAllStudent();
	public int saveStudent(Student student);
	public Student getStudentById(int id);
	public void updateStudent(Student student);
	public void deleteStudent(int id);
	public void saveEducationalDetails(EducationDetails educationDetails);
}
