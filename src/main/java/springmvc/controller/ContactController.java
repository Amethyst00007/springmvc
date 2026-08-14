package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
	public String showForm(){
		
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String Handleform(@RequestParam("email") String useremail, @RequestParam("username") String username, @RequestParam("password") String userpassword, Model model) {
		System.out.println("User Email:"+useremail);
		System.out.println("User Name:"+username);
		System.out.println("User Password:"+userpassword);
		
		model.addAttribute("email",useremail);
		model.addAttribute("username",username);
		model.addAttribute("password",userpassword);
		
		
		return "success";
	}

}
