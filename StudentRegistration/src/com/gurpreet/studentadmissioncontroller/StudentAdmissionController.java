package com.gurpreet.studentadmissioncontroller;

import java.io.IOException;
import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class StudentAdmissionController {

	@RequestMapping(value = "/admissionForm.html", method = RequestMethod.GET)
	public ModelAndView getAdmission() throws Exception{
		
		String exceptionOccured = "NO_EXCEPTION";
		
		if(exceptionOccured.equalsIgnoreCase("NULL_POINTER")) {
			throw new NullPointerException("null pointer exception");
		} else if(exceptionOccured.equalsIgnoreCase("IO_EXCEPTION")) {
			throw new IOException("IO Exception");
		}else if(exceptionOccured.equalsIgnoreCase("ARITHMETIC_EXCEPTION")) {
			throw new ArithmeticException("ARITHMETIC EXCEPTION");
		}
		
		ModelAndView modelandview = new ModelAndView("AdmissionForm");
		return modelandview;
	}
	
	@ModelAttribute
	public void addingCommonObjects(Model model) {
		model.addAttribute("msg", "Spring MVC Framework...");
	}
	
	@RequestMapping(value="/submitAdmissionForm.html", method = RequestMethod.POST)
	ModelAndView submitAdmissionForm(@Valid @ModelAttribute("student") Student student, BindingResult result) {
					
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("AdmissionForm");
			return model;
		}
		
		ModelAndView model = new ModelAndView("AdmissionSuccess");
		return model;
		
	}
	
	
}
