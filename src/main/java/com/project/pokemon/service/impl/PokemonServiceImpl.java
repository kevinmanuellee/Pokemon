package com.project.pokemon.service.impl;

import com.project.pokemon.DTO.PokemonRequestDTO;
import com.project.pokemon.DTO.PokemonResponseDTO;
import com.project.pokemon.entity.Pokemon;
import com.project.pokemon.repository.PokemonRepository;
import com.project.pokemon.service.PokemonService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@Service
public class PokemonServiceImpl implements PokemonService {

    @Autowired
    private PokemonRepository repository;

    @Override
    public List<PokemonResponseDTO> getPokemons(PokemonRequestDTO dto) {
        Pokemon pokemon = dtoToPokemon(dto);
        Example<Pokemon> exPokemon = Example.of(pokemon);
        Iterable<Pokemon> optionalPokemon = repository.findAll(exPokemon);
        Iterator<Pokemon> pokemonIterator= optionalPokemon.iterator();
        List<PokemonResponseDTO> dtoList = new ArrayList<>();
        while(pokemonIterator.hasNext()){
            dtoList.add(pokemonToDTO(pokemonIterator.next()));
        }
        return dtoList;
    }

    @Override
    public PokemonResponseDTO createPokemon(PokemonRequestDTO dto) {
        Pokemon pokemon = dtoToPokemon(dto);
        PokemonResponseDTO responseDTO = pokemonToDTO(repository.save(pokemon));
        return responseDTO;
    }

    @Override
    public List<PokemonResponseDTO> createPokemons(List<PokemonRequestDTO> dtos) {
        List<Pokemon> pokemons = new ArrayList<>();
        for(PokemonRequestDTO dto : dtos){
            pokemons.add(dtoToPokemon(dto));
        }
        repository.saveAll(pokemons);

        List<PokemonResponseDTO> responseDTOs = new ArrayList<>();
        for(Pokemon p : pokemons){
            responseDTOs.add(pokemonToDTO(p));
        }

        return responseDTOs;
    }

    private Pokemon dtoToPokemon(PokemonRequestDTO dto){
        Pokemon pokemon = new Pokemon();
        BeanUtils.copyProperties(dto, pokemon);
        return pokemon;
    }

    private PokemonResponseDTO pokemonToDTO(Pokemon pokemon){
        PokemonResponseDTO dto = new PokemonResponseDTO();
        BeanUtils.copyProperties(pokemon, dto);
        return dto;
    }
}
