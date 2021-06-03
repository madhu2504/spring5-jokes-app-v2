package in.madhusudanjoshi.jokesApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import in.madhusudanjoshi.jokesApp.service.JokeService;

@Controller
public class JokesController {


	//Spring will automatically autowired due to constructor approach
	private final JokeService jokesService;
	
	public JokesController(JokeService jokesService) {
		this.jokesService = jokesService;
	}


	@RequestMapping(value="/", method = RequestMethod.GET)
	public String joke(Model model) {
		
		model.addAttribute("joke",jokesService.getJoke());
		return "index";
		
	}
	
}
