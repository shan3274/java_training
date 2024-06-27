package com.accenture.lkm.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.swing.UIDefaults.LazyValue;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.accenture.lkm.business.bean.JavaLearningBean;
import com.accenture.lkm.entity.JavaLearningEntity;

//1.8-> Add annotation to indicate the class provides the mechanism for storage, retrieval, update, delete and search operation on objects
@Repository
@SuppressWarnings("unchecked")
// 1.9-> Add annotation to perform Transactions in JPA
@Transactional(value = "txManager")
public class TrainingDAOIMPL implements TrainingDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public Integer addTraining(JavaLearningBean javaLearningBean) throws Exception {
		Integer Id = 0;
		JavaLearningEntity javaLearningEntityBean = convertBeanToEntity(javaLearningBean);
		try {
			entityManager.persist(javaLearningEntityBean);
			Id = javaLearningEntityBean.getTrainingId();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Id;
	}

	public JavaLearningBean updateTrainingDetails(JavaLearningBean javaLearningBean) throws Exception {
		// TODO Auto-generated method stub
		JavaLearningBean learnigBean2 = null;
		try {
			JavaLearningEntity javaLearningEntity2 = (JavaLearningEntity) entityManager.find(JavaLearningEntity.class,
					javaLearningBean.getTrainingId());
			if (javaLearningEntity2 != null) {
				javaLearningEntity2.setCompany(javaLearningBean.getCompany());
				javaLearningEntity2.setLocation(javaLearningBean.getLocation());
				javaLearningEntity2.setTraining_name(javaLearningBean.getTraining_name());
				javaLearningEntity2.setTraining_startDate(javaLearningBean.getTraining_startDate());
				javaLearningEntity2.setTraining_endDate(javaLearningBean.getTraining_endDate());
				learnigBean2 = convertEntityToBean(javaLearningEntity2);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	public JavaLearningBean deleteTrainingDetails(Integer id) throws Exception {
		JavaLearningBean learningBean = null;
		try {
			JavaLearningEntity learningEntity = (JavaLearningEntity) entityManager.find(JavaLearningEntity.class, id);
			if (learningEntity != null) {
				entityManager.remove(learningEntity);
				learningBean = convertEntityToBean(learningEntity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return learningBean;
	}

	public List<JavaLearningBean> getTrainingList() throws Exception {
		// TODO Auto-generated method stub
		List<JavaLearningBean> learningList = null;
		try {
			learningList = new ArrayList<JavaLearningBean>();
			List<JavaLearningEntity> learningEntity = entityManager.createQuery("from JavaLearningEntity").getResultList();
			for (JavaLearningEntity entity : learningEntity) {
				JavaLearningBean lern = convertEntityToBean(entity);
				learningList.add(lern);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return learningList;
	}

	public JavaLearningBean getTraingDetailsbyId(Integer id) throws Exception {
		JavaLearningBean learningBean = null;
		try {
			JavaLearningEntity entity = entityManager.find(JavaLearningEntity.class, id);
			if (entity != null) {
				learningBean = convertEntityToBean(entity);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return learningBean;
	}

	private JavaLearningEntity convertBeanToEntity(JavaLearningBean javaLearningBean) {
		// TODO Auto-generated method stub
		JavaLearningEntity entityBean = new JavaLearningEntity();
		BeanUtils.copyProperties(javaLearningBean, entityBean);

		return entityBean;
	}

	private JavaLearningBean convertEntityToBean(JavaLearningEntity javaLearningEntity2) {
		// TODO Auto-generated method stub
		JavaLearningBean bean = new JavaLearningBean();
		BeanUtils.copyProperties(javaLearningEntity2, bean);
		return bean;
	}

	// 1.10-> Add annotation to indicate that the EntityManager must be
	// automatically injected
	// 1.11->Add/override the methods to perform persist/add,update,delete and get
	// operation
	// 1.12-> provide utility method to convert bean to entity and entity to bean

}