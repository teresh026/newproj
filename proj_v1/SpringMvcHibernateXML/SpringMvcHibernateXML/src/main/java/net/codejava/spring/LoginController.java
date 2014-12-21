package net.codejava.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	@RequestMapping(value = { "/" }, method = RequestMethod.GET)
	public ModelAndView defaultPage() {

	  ModelAndView model = new ModelAndView();
	  model.setViewName("login");
	  return model;

	}


	@RequestMapping(value =  { "/home**"}, method = RequestMethod.GET)
	public ModelAndView adminPage() {

	  ModelAndView model = new ModelAndView();
	  model.addObject("title", "Top Screen");
	  model.addObject("message", "This is Top screen");
	  model.setViewName("home");
	  return model;

	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("login");

	  return model;

	}



	//for 403 access denied page
	@RequestMapping(value = "/403", method = RequestMethod.GET)
	public ModelAndView accesssDenied() {

	  ModelAndView model = new ModelAndView();

	  //check if user is login
//	  Authentication auth = SecurityContextHolder.getContext().getAuthentication();
//	  if (!(auth instanceof AnonymousAuthenticationToken)) {
//		UserDetails userDetail = (UserDetails) auth.getPrincipal();
//		model.addObject("username", userDetail.getUsername());
//	  }

	  model.setViewName("403");
	  return model;

	}

}