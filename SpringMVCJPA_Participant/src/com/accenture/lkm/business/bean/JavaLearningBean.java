package com.accenture.lkm.business.bean;

import java.util.Date;

import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

public class JavaLearningBean {

	// 1.1->
	// Trainingid(Integer),training_name(String),company(String),location(String),training_startDate(Date),training_endDate(Date)
	// Getter Setter Methods for : Trainingid,training_name; company;
	// location;private Date training_startDate;Date training_endDate
	// Ensure Trainingid is a mandatory field

	@NotNull(message = "TrainingId Cannot be Empty")
	private Integer trainingId;

	@NotEmpty(message = "Training Name Cannot be Empty")
	private String training_name;

	@NotEmpty(message = "Company Cannot be Empty")
	private String company;

	@NotEmpty(message = "Location Cannot be Empty")
	private String location;

	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	@NotNull(message = "Date cannot be empty")
	private Date training_startDate;

	@DateTimeFormat(pattern = "dd-MMM-yyyy")
	@NotNull(message = "Date cannot be empty")
	private Date training_endDate;

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
