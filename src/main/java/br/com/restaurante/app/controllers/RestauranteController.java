package br.com.restaurante.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.restaurante.app.dao.RestauranteRepository;
import br.com.restaurante.app.models.Restaurante;

@Controller
@RequestMapping("restaurantes")
public class RestauranteController {
	
	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@RequestMapping("/cadastrar")
	public String form() {
		return "restaurantes/cadastrar";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String gravar (Restaurante restaurante) {
		System.out.println(restaurante);
		restauranteRepository.save(restaurante);
		
		return "Restaurante inserido com sucesso";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ModelAndView listar() {
		
		List<Restaurante> restaurantes = (List<Restaurante>) restauranteRepository.findAll();
		ModelAndView modelAndView = new ModelAndView("restaurantes/lista");
		modelAndView.addObject("restaurantes", restaurantes);
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deletar(Integer id) {
		
		restauranteRepository.delete(id);
	}
}
