package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import boots.model.Pokemon;
import boots.dao.PokemonRepository;

@Service @Transactional
public class PokemonService {
	
	private final PokemonRepository pokemonRepository;

	public PokemonService(PokemonRepository pokemonRepository) {
		super();
		this.pokemonRepository = pokemonRepository;
	}
	
	public List<Pokemon> findAll(){
		List<Pokemon> pokemons = new ArrayList<Pokemon>();
		for (Pokemon pokemon : pokemonRepository.findAll()) {
			pokemons.add(pokemon);
		}
		return pokemons;
	}
	
	public void save(Pokemon pokemon){
		pokemonRepository.save(pokemon);
	}
	
	public void delete(int id){
		pokemonRepository.delete(id);
	}
	public Pokemon findOne(int id){
		return pokemonRepository.findOne(id);
	}
	
}
