package net.codejava.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import net.codejava.spring.model.User;
import net.codejava.spring.service.UserService;

@Controller
public class RegisterContactController {
	@Autowired
	protected UserService service;
	
//	@RequestMapping(value="/registercontact")
//	public ModelAndView addContact() {
//		ModelAndView model = new ModelAndView("registercontact");
//		return model;
//		}
	
	@RequestMapping(value="/registercontact") 
		public String registerContact(Model model) {
		model.addAttribute("user", new User());
			return "registercontact";
	}
	
	@RequestMapping(value="registercontact", method = RequestMethod.POST)
	public String registerContact(@ModelAttribute("user") User user) {
		service.registerContact(user);
		return "redirect:/";
	}

}
