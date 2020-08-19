package tomsspring;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Controllerr {
	
	
	@RequestMapping("/")
	public String home() {
		return "home";
		
	}
	
	@RequestMapping("/userDetails")
	public String userDetails(HttpServletRequest request, Model model) {
		String givenUsername = request.getParameter("username");
		givenUsername = givenUsername.toUpperCase();
		model.addAttribute("uss", givenUsername);
		return "userDetails";
		
	}
	
	
	@RequestMapping("/userDetails2")
	public String userDetails(
			@RequestParam("username") String username,
			Model model)
	{
		String givenUsername;
		givenUsername = username.toUpperCase();
		model.addAttribute("uss", givenUsername);
		return "userDetails";
		
	}


}
