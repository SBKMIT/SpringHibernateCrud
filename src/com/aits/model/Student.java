package com.aits.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="Student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sid;


	@Column
	@NotEmpty(message="Enter the Name")
	private String name;

	@Column
	@NotEmpty(message="Enter the address")
	private String address;

	@Column
	@NotEmpty(message="Enter the email")
	@Email(message="Enter proper Email ID")
	private String email;

	@Column
	@NotEmpty(message="Enter the telephone")
	@Size(min = 10, max = 15)
	private String telephone;

	@OneToMany
	private Collection<Vehical> vehical=new ArrayList<Vehical>();
	
	@ManyToMany
	private Collection<Subject> subject=new ArrayList<>();
	
	
	public int getId() {
		return sid;
	}

	public void setId(int id) {
		this.sid = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}


}
