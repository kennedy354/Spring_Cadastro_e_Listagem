package br.com.ifce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import br.com.ifce.model.Quadrinho;
import br.com.ifce.service.HQservice;

@Controller
public class HQcontroller {
	
	@Autowired
	private HQservice hqService;
	
	@GetMapping("/home")
	public String home() {
		return "home";
	}
	
	@GetMapping("/home/formulario")
	public String formulario() {
		return "formulario";
	}
	
	@GetMapping("/home/formulario/salvar")
	public String salvar(Quadrinho quadrinho) {
		hqService.cadastrarHQ(quadrinho);
		return "salvou";
	}
	
	@GetMapping("/home/lista")
	public ModelAndView listarHQs() {
		List<Quadrinho> quadrinhos = hqService.listarHQs();
		
		ModelAndView mv = new ModelAndView("lista-hqs");
		
		mv.addObject("listaHQs", quadrinhos);
		
		return mv;
	}
}
