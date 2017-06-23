package com.springmvc_form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc_form.model.Employee;

@Controller
public class FormController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	 public ModelAndView showForm() {
        return new ModelAndView("add", "employee", new Employee());
    }
		
	@RequestMapping(value = "/submitForm", method = RequestMethod.POST)
	public String SubmitForm(@ModelAttribute("employee") @Validated Employee employee, BindingResult result,
			ModelMap model) {

		if (result.hasErrors()) {
			return "error page";
		}
		model.addAttribute("firstname", employee.getFirstname());
		model.addAttribute("lastname", employee.getLastname());
		return "success";

	}

}
