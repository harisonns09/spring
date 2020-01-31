package br.com.mjv.trainning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("home");
		return mv;
	}

}
