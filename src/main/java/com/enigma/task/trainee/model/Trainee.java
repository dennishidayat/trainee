package com.enigma.task.trainee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.enigma.task.bootcampbatch.model.BootcampBatch;

@Entity
@Table(name="trainee")
public class Trainee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="trainee_id")
	private int traineeId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="email")
	private String email;
	@Column(name="phone")
	private int phone;
	@Column(name="address")
	private String address;
	@ManyToOne(targetEntity = BootcampBatch.class)
	@JoinColumn(name="batch_id")
	private BootcampBatch bootcampBatch;
	@Column(name="active_flag")
	private Boolean activeFlag;
	
	public Trainee(int traineeId, String firstName, String lastName, String email, int phone, String address, BootcampBatch bootcampBatch, Boolean activeFlag) {
		this.traineeId = traineeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.bootcampBatch = bootcampBatch;
		this.activeFlag = activeFlag;
	}
	
	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BootcampBatch getBootcampBatch() {
		return bootcampBatch;
	}

	public void setBootcampBatch(BootcampBatch bootcampBatch) {
		this.bootcampBatch = bootcampBatch;
	}

	public Boolean getActiveFlag() {
		return activeFlag;
	}

	public void setActiveFlag(Boolean activeFlag) {
		this.activeFlag = activeFlag;
	}

	public Trainee() {}
	
}
