package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Pokemon;

public interface PokemonRepository extends CrudRepository<Pokemon, Integer>{

}
