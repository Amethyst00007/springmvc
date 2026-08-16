package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.modal.User;
import springmvc.userservice.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userservice;
	@ModelAttribute
	public void common(Model m) {
		m.addAttribute("Header", "Hope");
		m.addAttribute("Desc", "Where There is a will, there is a way!");
		
	}
	
	@RequestMapping("/contact")
	public String showForm(){
		
		return "contact";
	}
	
	@RequestMapping(path="/processform", method=RequestMethod.POST)
	public String Handleform(@ModelAttribute User user, Model model) {
		int id = this.userservice.createUser(user);
		model.addAttribute("msg", "User created with id:"+id);
		return "success";
	}

}
