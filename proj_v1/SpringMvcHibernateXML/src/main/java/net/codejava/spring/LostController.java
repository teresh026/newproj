package net.codejava.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LostController {

	@RequestMapping(value="/lost")
		public ModelAndView lost() {
		ModelAndView model = new ModelAndView("lost");
		return model;
	}
}
