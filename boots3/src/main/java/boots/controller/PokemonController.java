package boots.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import boots.service.PokemonService;

import boots.model.Pokemon;

@Controller
public class PokemonController {

	@Autowired
	private PokemonService pokemonService;

	
	@GetMapping("/all-pokemones")
	public String allPokemones(HttpServletRequest request){
		request.setAttribute("pokemones", pokemonService.findAll());
		request.setAttribute("mode", "MODE_POKEMONES");
		return "pokemon";
	}
	
	@GetMapping("/new-pokemon")
	public String newPokemon(HttpServletRequest request){
		request.setAttribute("mode", "MODE_NEW");
		return "pokemon";
	}
	
	@GetMapping("/update-pokemon")
	public String updateTask(@RequestParam int id,HttpServletRequest request){
		request.setAttribute("pokemon", pokemonService.findOne(id));
		request.setAttribute("mode", "MODE_UPDATE");
		return "pokemon";
	}
	
	@GetMapping("/delete-pokemon")
	public String deleteTask(@RequestParam int id,HttpServletRequest request){
		pokemonService.delete(id);
		request.setAttribute("pokemones", pokemonService.findAll());
		request.setAttribute("mode", "MODE_POKEMONES");
		return "pokemon";
	}
	
	@PostMapping("/save-pokemon")
	public String saveTask(@ModelAttribute Pokemon pokemon,
			BindingResult bindingResult,HttpServletRequest request){
		pokemonService.save(pokemon);
		request.setAttribute("pokemones", pokemonService.findAll());
		request.setAttribute("mode", "MODE_POKEMONES");
		return "pokemon";
		
	}
	
}
