package com.enigma.task.trainee.dto;

import com.enigma.task.bootcampbatch.model.BootcampBatch;

public class TraineeDto {
	private Integer traineeId;
	private String firstName;
	private String lastName;
	private String email;
	private Integer phone;
	private String address;
	private BootcampBatch bootcampBatch;
	private Boolean activeFlag;
	
	public TraineeDto(Integer traineeId, String firstName, String lastName, String email, Integer phone, String address, BootcampBatch bootcampBatch, Boolean activeFlag) {
		this.traineeId = traineeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.address = address;
		this.bootcampBatch = bootcampBatch;
		this.activeFlag = activeFlag;
	}
	
	public Integer getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(Integer traineeId) {
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

	public Integer getPhone() {
		return phone;
	}

	public void setPhone(Integer phone) {
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

	public TraineeDto() {}
	
}
