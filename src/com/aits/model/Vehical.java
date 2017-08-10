package com.aits.model;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="vehical")
public class Vehical implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private int vehicalId;

	@Column
	private String vehicalName;

	@Column
	private long vehicalNumber;

	@ManyToOne
	private Student student;




	public int getVehicalId() {
		return vehicalId;
	}

	public void setVehicalId(int vehicalId) {
		this.vehicalId = vehicalId;
	}

	public String getVehicalName() {
		return vehicalName;
	}

	public void setVehicalName(String vehicalName) {
		this.vehicalName = vehicalName;
	}

	public long getVehicalNumber() {
		return vehicalNumber;
	}

	public void setVehicalNumber(long vehicalNumber) {
		this.vehicalNumber = vehicalNumber;
	}


}
