package service;

import java.util.List;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import dao.AthleteDaoImpl;
import main.Athlete;

public class AthleteServiceImpl implements IAthleteService{
	AthleteDaoImpl dao=new AthleteDaoImpl();
	public ModelAndView check(@ModelAttribute("Athlete") Athlete athlete,AthleteDaoImpl dao) {
		// TODO Auto-generated method stub
		String name=athlete.getName();
		//check name
		if(name.equals("")||!Character.isUpperCase(name.codePointAt(0))||name.length()>40) {
			return new ModelAndView("error","error","Name invalid.");
		}
		//check gender. Fails at the moment.
		if(athlete.getGender().equals("")) {
			return new ModelAndView("error","error","Gender not selected.");
		}
		//check category
		if(athlete.getCategory().equals("Select")) {
			return new ModelAndView("error","error","Category not selected.");
		}
		//check email
		String email=athlete.getEmail();
		if(!(email.contains("@")&&(email.endsWith(".com")||email.endsWith(".org")||email.endsWith(".edu"))))
			return new ModelAndView("error","error","Email invalid.");
		//check mobile
		if(athlete.getMobile().length()!=10) {
			return new ModelAndView("error","error","Mobile length invalid.");
		}
		//success
		int j=1;
		List<Athlete>e=dao.getDetails();
		for(Athlete a:e) {
			if(j<a.getId())
				j=a.getId();
		}
		return new ModelAndView("success","athleteid", j+1);
	}

}
