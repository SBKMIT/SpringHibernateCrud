package com.aits.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aits.dao.StudentDAO;
import com.aits.model.EducationDetails;
import com.aits.model.Student;


@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return studentDAO.getAllStudent();
	}

	@Override

	public int saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDAO.saveStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return studentDAO.getStudentById(id);
	}

	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		studentDAO.updateStudent(student);
	}

	@Override

	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		studentDAO.deleteStudent(id);
	}

	@Override
	public void saveEducationalDetails(EducationDetails educationDetails) {
		// TODO Auto-generated method stub
		studentDAO.saveEducationalDetails(educationDetails);
	}


}
