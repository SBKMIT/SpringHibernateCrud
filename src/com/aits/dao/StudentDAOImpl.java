package com.aits.dao;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.aits.model.EducationDetails;
import com.aits.model.Student;

@Repository
public class StudentDAOImpl implements StudentDAO {


	@Autowired
	private SessionFactory sessionFactory;

	@SuppressWarnings("unchecked")
	public List<Student> getAllStudent() {


		return sessionFactory.getCurrentSession().createQuery("from Student").list();
	}

	@Override
	public int saveStudent(Student student) {

		return (int) sessionFactory.getCurrentSession().save(student);
	}

	@Override
	public Student getStudentById(int id) {

		return (Student) sessionFactory.getCurrentSession().get(Student.class,id);
	}

	@Override
	public void updateStudent(Student student) {

		sessionFactory.getCurrentSession().update(student);
	}

	@Override
	public void deleteStudent(int id) {

		Student student=(Student)sessionFactory.getCurrentSession().load(Student.class,id);
		if(null!=student){
			sessionFactory.getCurrentSession().delete(student);
		}

	}

	@Override
	public void saveEducationalDetails(EducationDetails educationDetails) {

		sessionFactory.getCurrentSession().saveOrUpdate(educationDetails);;
	}

}
