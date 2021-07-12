package com.project.pokemon.repository;

import com.project.pokemon.entity.Pokemon;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonRepository extends CrudRepository<Pokemon, Long> {
    //TODO - filtering?
}
