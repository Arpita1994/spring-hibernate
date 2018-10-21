package com.jwt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Department;
import com.jwt.service.DepartmentService;
@Controller
public class DepartmentController {
	
	
	@Autowired
	private DepartmentService departmentService;
	
	@RequestMapping(value = "/newDepartment", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		Department department = new Department();
		model.addObject("department", department);
		model.setViewName("departmentForm");
		return model;
	}
	
	@RequestMapping(value = "/saveDepartment", method = RequestMethod.POST)
	public ModelAndView saveEmployee(@ModelAttribute Department department) {
		if (department.getId() == 0) { // if employee id is 0 then creating the
			// employee other updating the employee
			departmentService.addDepartment(department);
		} 
		return new ModelAndView("redirect:/");
	}
}
