package net.codejava.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class TopController {
	
	@RequestMapping(value="/top")
	public ModelAndView top() {
		ModelAndView model = new ModelAndView("top");
		return model;
	}
}
