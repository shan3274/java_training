package com.accenture.lkm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.accenture.lkm.business.bean.JavaLearningBean;
import com.accenture.lkm.dao.TrainingDAO;

//1.4-> Add service layer annotation to represent business logic
@Service
public class TrainingServiceIMPL implements TrainingService {

	// 1.5->Add annotation to invoke the DAO methods
	@Autowired
	TrainingDAO trainingDAO;

	// 1.6-> Write the logic for business representation
	public Integer addTraining(JavaLearningBean javaLearningBean) throws Exception {
		return trainingDAO.addTraining(javaLearningBean);
	}

	public JavaLearningBean updateTrainingDetails(JavaLearningBean javaLearningBean) throws Exception {
		return trainingDAO.updateTrainingDetails(javaLearningBean);
	}

	public JavaLearningBean deleteTrainingDetails(Integer id) throws Exception {
		return trainingDAO.deleteTrainingDetails(id);
	}

	public List<JavaLearningBean> getTrainingList() throws Exception {
		return trainingDAO.getTrainingList();
	}

	public JavaLearningBean getTraingDetailsbyId(Integer id) throws Exception {
		return trainingDAO.getTraingDetailsbyId(id);
	}

}
