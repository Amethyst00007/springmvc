package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("This is our home url");
		model.addAttribute("name","Anusha Singh");
		model.addAttribute("id",79);
		return "index";
		
	}
	
     @RequestMapping("/about")
	  public String about() {
			System.out.println("This is about home url");
			return "about";		
	}
     
     @RequestMapping("/help")
	  public ModelAndView help() {
			System.out.println("This is about help url");
			ModelAndView mav = new ModelAndView();
			
			mav.addObject("name","Anusha");
			mav.addObject("id",9876);
			
			List<Integer> marks = new ArrayList<>();
			marks.add(78);
			marks.add(34);
			marks.add(90);
			mav.addObject("marks", marks);
			
			mav.setViewName("help");
			
			return mav;		
	}

}
