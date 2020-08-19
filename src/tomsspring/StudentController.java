package tomsspring;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	//trimms strings to 'null' if spaces are entered
	@InitBinder
	public void initBinder(WebDataBinder dataBinder) {
		StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, trimmerEditor);
	}
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student thestudent = new Student();
		
		model.addAttribute("student", thestudent);
		return "student-form";
	}
	
	
	
	@RequestMapping("/processForm")
	public String showForm(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {
		Student thestudent = new Student();
		
	System.out.println(theStudent.getFirstName());
	if(bindingResult.hasErrors()) {
		return "student-form";
	}
	else {
		return "student-confirmation";
	}
	}


}
