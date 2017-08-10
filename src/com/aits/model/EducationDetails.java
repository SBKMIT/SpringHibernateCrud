package com.aits.model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="EducationDetails")
public class EducationDetails implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int educationId;

	@Column
	private String department;

	@Column
	private String rollNumber;

	@Column
	private String classYears;
	
	@OneToOne(targetEntity=Student.class,cascade=CascadeType.ALL)
	@JoinColumn(name="stu_id")
    private Student student; 

	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public int getEducationId() {
		return educationId;
	}
	public void setEducationId(int educationId) {
		this.educationId = educationId;
	}


	public String getClassYears() {
		return classYears;
	}
	public void setClassYears(String classYears) {
		this.classYears = classYears;
	}



	public String getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(String rollNumber) {
		this.rollNumber = rollNumber;
	}

	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}




}
