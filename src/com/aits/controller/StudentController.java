package com.aits.controller;

import java.util.List;

import javax.persistence.Id;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aits.model.EducationDetails;
import com.aits.model.Student;
import com.aits.service.StudentService;


@Controller
public class StudentController {

	@Autowired
	private StudentService studentService;
	@Id
	int id;
	@RequestMapping(value="/")
	public String homePage(Model model){

		List<Student> studentList=studentService.getAllStudent();

		System.out.println("List="+studentList);
		model.addAttribute("students", studentList);
		return "home";

	}

	@RequestMapping(value="newStudent",method=RequestMethod.GET)
	public String addStudent(Model model){
		Student student=new Student();
		model.addAttribute("student",student);
		return "studentForm";
	}


	@RequestMapping(value="saveStudent",method=RequestMethod.POST)
	public String saveStudent(@Valid @ModelAttribute("student") Student student,BindingResult result, Model model){

		if(result.hasErrors()){
			return"studentForm";
		}
		else{
			if(student.getId()==0){
				id=studentService.saveStudent(student);
				System.out.println("ID IS="+id);
			}else{

				studentService.updateStudent(student);
			}

			EducationDetails educationDetails=new EducationDetails();
			model.addAttribute("educationDetails", educationDetails);


			return "educationDetailForm";
		}
	}

	@RequestMapping(value="deleteStudent",method=RequestMethod.GET)
	public String deleteStudent(@RequestParam int id, Model model){

		studentService.deleteStudent(id);

		return "redirect:/";
	}

	@RequestMapping(value="editStudent",method=RequestMethod.GET)
	public String editStudent(@RequestParam int id, Model model){

		Student student=studentService.getStudentById(id);
		model.addAttribute("student", student);

		return "studentForm";
	}


	@RequestMapping(value="saveEducationDetail",method=RequestMethod.POST)
	public String saveEducationDetail(Model model,@ModelAttribute("educationDetails")EducationDetails educationDetails){


		Student student=studentService.getStudentById(id);


		educationDetails.setStudent(student);

		studentService.saveEducationalDetails(educationDetails);
		return "redirect:/";
	}


	@RequestMapping(value="/studList",method=RequestMethod.GET)
	public @ResponseBody List<Student> listEmployee() {
		return studentService.getAllStudent();

	}
}
