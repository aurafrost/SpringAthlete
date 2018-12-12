package service;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import dao.AthleteDaoImpl;
import main.Athlete;

public interface IAthleteService {
	public ModelAndView check(@ModelAttribute("Athlete") Athlete athlete,AthleteDaoImpl dao);
}
