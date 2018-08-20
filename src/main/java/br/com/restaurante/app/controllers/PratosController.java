package br.com.restaurante.app.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.restaurante.app.dao.PratoRepository;
import br.com.restaurante.app.dao.RestauranteRepository;
import br.com.restaurante.app.models.Prato;
import br.com.restaurante.app.models.Restaurante;
import br.com.restaurante.app.request.PratoRequest;

@Controller
@RequestMapping("pratos")
public class PratosController {

	@Autowired
	private PratoRepository pratoRepository;

	@Autowired
	private RestauranteRepository restauranteRepository;
	
	@RequestMapping("/cadastrar")
	public ModelAndView form () {
		
		List<Restaurante> restaurantes = (List<Restaurante>) restauranteRepository.findAll();
		ModelAndView modelAndView = new ModelAndView("pratos/cadastrar");
		modelAndView.addObject("restaurantes", restaurantes);
		
		return modelAndView;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String gravar (PratoRequest pratoRequest) {
		Restaurante restaurante = restauranteRepository.findOne(pratoRequest.getRestauranteID());
		
		if (restaurante == null) {
			throw new IllegalArgumentException("Restaurante não encontrado");
		}
		Prato prato = new Prato();
		prato.setNome(pratoRequest.getNome());
		prato.setValor(pratoRequest.getValor());
		prato.setRestaurante(restaurante);
		
		System.out.println(prato);
		pratoRepository.save(prato);
		
		return "Prato inserido com sucesso";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Prato> listar () {
		
		List<Prato> pratos = (List<Prato>) pratoRepository.findAll();
		
		return pratos;
	}
	
	@RequestMapping(method = RequestMethod.DELETE)
	public void deletar (Integer id) {
		
		pratoRepository.delete(id);
		
	}
}
