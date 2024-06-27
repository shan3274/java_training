package com.accenture.lkm.entity;

import java.util.Date;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

//Add Annotation for Entity class and table name should be "Learning"
@Entity
@Table(name = "JavaLearning")
public class JavaLearningEntity {
	// 1.2
	// Add annotation for keeping Trainingid as Primary Key and auto_incremented
	// Add a default constructor and getter/setter methods for all fields as per
	// bean class
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer trainingId;
	private String training_name;
	private String company;
	private String location;
	private Date training_startDate;
	private Date training_endDate;

	public JavaLearningEntity() {
		super();
	}

	public Integer getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(Integer trainingId) {
		this.trainingId = trainingId;
	}

	public String getTraining_name() {
		return training_name;
	}

	public void setTraining_name(String training_name) {
		this.training_name = training_name;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Date getTraining_startDate() {
		return training_startDate;
	}

	public void setTraining_startDate(Date training_startDate) {
		this.training_startDate = training_startDate;
	}

	public Date getTraining_endDate() {
		return training_endDate;
	}

	public void setTraining_endDate(Date training_endDate) {
		this.training_endDate = training_endDate;
	}

}
