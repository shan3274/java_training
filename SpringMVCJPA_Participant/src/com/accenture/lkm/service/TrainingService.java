package com.accenture.lkm.service;

import java.util.List;

import com.accenture.lkm.business.bean.JavaLearningBean;

public interface TrainingService {

	// 1.3-> Add abstract methods for->
	// addTraining(),updateTrainingDetails(),deleteTrainingDetails(),getTrainingList(),getTrainingDetailsbyId()
	public Integer addTraining(JavaLearningBean javaLearningBean) throws Exception;

	public JavaLearningBean updateTrainingDetails(JavaLearningBean javaLearningBean) throws Exception;

	public JavaLearningBean deleteTrainingDetails(Integer id) throws Exception;

	public List<JavaLearningBean> getTrainingList() throws Exception;

	public JavaLearningBean getTraingDetailsbyId(Integer id) throws Exception;
}
