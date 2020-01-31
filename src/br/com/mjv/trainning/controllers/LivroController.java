package br.com.mjv.trainning.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/livros")
public class LivroController {
	
	/*
	 * @Autowired private LivroDAO dao;
	 */
	
	@RequestMapping("/form")
	public ModelAndView showForm() {
		ModelAndView mv = new ModelAndView("livros/form");
		return mv;
	}

}
