package web.roomkarte.jp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="inspectionsearch")
public class InspectionSearchController {

//	@Autowired
//	private InspectionDAO inspectionDao;


//	@RequestMapping(params="form", method=RequestMethod.GET)
	@RequestMapping(value = "/views/inspectionsearch")
	public String form(Model model) {
//	model.addAttribute(new Inspection());
	return "inspectionsearch";
	}


}


