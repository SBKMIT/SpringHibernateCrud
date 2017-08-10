package com.aits.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aits.model.Student;

@Controller
public class LoginController {
	@RequestMapping(value="loginStudent",method=RequestMethod.GET)
	public String loginStudent(Model model){
		/*Student student=new Student();
		model.addAttribute("student",student);*/
		return "login";
	}
}
