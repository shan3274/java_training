package com.accenture.lkm.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.accenture.lkm.business.bean.JavaLearningBean;
import com.accenture.lkm.service.TrainingService;

//1.13-> Make this class as Controller
@Controller
// 1.14-> Add session to transfer data from Model to session
@SessionAttributes({ "trainObj", "trainObj2" })
@SuppressWarnings("unused")
public class TrainingController {
	// 1.15-> Inject Service to call the methods
	@Autowired
	private TrainingService trainingService;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
		binder.registerCustomEditor(Date.class, "training_startDate", new CustomDateEditor(sdf, true));
		binder.registerCustomEditor(Date.class, "training_endDate", new CustomDateEditor(sdf, true));
	}

	// 1.16-> Add the request mapping url
	// 1.17-> Define the methods and add data in model and display the response
	// 1.18-> For Update operation data should be transferred to Session
	@RequestMapping(value = "/LoadSaveTraining", method = RequestMethod.GET)
	public ModelAndView addTraining() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("CreateTraining");
		mv.addObject("trainObj", new JavaLearningBean());
		return mv;
	}

	@RequestMapping(value = "/saveTraining", method = RequestMethod.GET)
	public ModelAndView saveTraining(@ModelAttribute("trainObj") @Valid JavaLearningBean javaLearningBean,
			BindingResult result) throws Exception {
		int i = trainingService.addTraining(javaLearningBean);
		ModelAndView mv = new ModelAndView();
		String pageName = "";
		System.out.println("1");
		if (result.hasErrors()) {
			System.out.println("Error Function");
			pageName = "CreateTraining";
		} else {
			trainingService.addTraining(javaLearningBean);
			System.out.println("Else Part");
			// mv.setViewName("CreateTrainingSuccess");
			mv.addObject("message", "JavaLearningbean added Succesfully with id");
			pageName = "CreateTrainingSuccess";
		}
		mv.setViewName(pageName);
		return mv;
	}

	@RequestMapping(value = "/GetDetails", method = RequestMethod.GET)
	public ModelAndView getTrainingDetails() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<JavaLearningBean> javaLearningBeansList = trainingService.getTrainingList();
		mav.setViewName("GetAllTrainingDetails");
		mav.addObject("TrainingDetailsList", javaLearningBeansList);
		return mav;
	}

	@RequestMapping(value = "/LoadUpdateTraining", method = RequestMethod.GET)
	public ModelAndView loadUpdateTraining() throws Exception {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("UpdateTraining");
		modelAndView.addObject("trainObj", new JavaLearningBean());
		return modelAndView;
	}

	// After execution of this method empObj will be stored in session scope
	@RequestMapping(value = "/LoadUpdate2", method = RequestMethod.POST)
	public ModelAndView loadUpdate2(@ModelAttribute("trainObj") JavaLearningBean javaLearningBean)
			throws Exception {
		JavaLearningBean javaLearningBean2 = trainingService.getTraingDetailsbyId(javaLearningBean.getTrainingId());
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Hi New Model data ");
		modelAndView.setViewName("UpdateTraining");
		modelAndView.addObject("trainObj2", javaLearningBean2);
		return modelAndView;
	}

	// After execution of this handler empObj2 will be stored in SessionScope
	@RequestMapping(value = "/UpdateTraining", method = RequestMethod.POST)
	public ModelAndView updateTraining(@ModelAttribute("trainObj2") JavaLearningBean javaLearningBean)
			throws Exception {
		JavaLearningBean javaLearningBean2 = trainingService.updateTrainingDetails(javaLearningBean);
		ModelAndView modelAndView = new ModelAndView();
		System.out.println("Hi New Session data ");
		modelAndView.setViewName("UpdateTrainingSuccess");
		modelAndView.addObject("message", "Training Details Updated");
		return modelAndView;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public ModelAndView del(@RequestParam("trainingId") Integer id) throws Exception {
		ModelAndView mv = new ModelAndView();
		JavaLearningBean i = trainingService.deleteTrainingDetails(id);
		mv.setViewName("DeleteTraingSuccess");
		mv.addObject("msg", i + " Record Deleted Succesfully");
		return mv;
	}

	@RequestMapping(value = "/GetDetById", method = RequestMethod.GET)
	public ModelAndView loadDet() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteTraining");
		mv.addObject("gtObj", new JavaLearningBean());
		return mv;
	}
}