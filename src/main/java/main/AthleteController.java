package main;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.AthleteDaoImpl;
import service.AthleteServiceImpl;

@Controller
public class AthleteController {
	@Autowired
	AthleteDaoImpl dao=new AthleteDaoImpl();
	AthleteServiceImpl impl=new AthleteServiceImpl();
	@RequestMapping("/add")
	public ModelAndView displayAddForm() {
		return new ModelAndView("add","command",new Athlete());
	}
	
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView add(@ModelAttribute("Athlete") Athlete athlete) {
		System.out.println("checking");
		ModelAndView m=impl.check(athlete,dao);
		dao.save(athlete);
		return m;
	}
	
	@RequestMapping("/view")
	public ModelAndView viewDetails() {
		List<Athlete>e=dao.getDetails();
		return new ModelAndView("view","athlist",e);
	}
}
