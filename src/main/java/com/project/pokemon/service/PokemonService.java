package com.project.pokemon.service;

import com.project.pokemon.DTO.PokemonRequestDTO;
import com.project.pokemon.DTO.PokemonResponseDTO;

import java.util.List;

public interface PokemonService {
    List<PokemonResponseDTO> getPokemons(PokemonRequestDTO dto);
    PokemonResponseDTO createPokemon(PokemonRequestDTO dto);
    List<PokemonResponseDTO> createPokemons(List<PokemonRequestDTO> dtos);
}
