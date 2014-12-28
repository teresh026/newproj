package web.roomkarte.jp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="top")
public class TopController {

//	@Autowired
//	private InspectionDAO inspectionDao;


//	@RequestMapping(params="form", method=RequestMethod.GET)
	@RequestMapping(value = "top")
	public String form(Model model) {
//	model.addAttribute(new Inspection());
	return "top";
	}


}


