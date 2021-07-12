package com.project.pokemon;

import com.project.pokemon.DTO.PokemonRequestDTO;
import com.project.pokemon.DTO.PokemonResponseDTO;
import com.project.pokemon.service.PokemonService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class PokemonApplicationTests {

	@Autowired
	private PokemonService pokemonService;

	@Test
	public void testCreateAndGetPokemon(){
		PokemonRequestDTO dto = createPokemonRequestDTO();
		PokemonResponseDTO responseDTO = pokemonService.createPokemon(dto);
		Assertions.assertEquals(createPokemonResponseDTO().toString(), responseDTO.toString());

		PokemonRequestDTO legendaryDto = createLegendaryPokemonRequestDTO();
		pokemonService.createPokemon(legendaryDto);
		List<PokemonResponseDTO> pokemons = pokemonService.getPokemons(requestLegendaryPokemon());
		Assertions.assertEquals(1, pokemons.size());
		Assertions.assertEquals(createLegendaryPokemonResponseDTO().toString(), pokemons.get(0).toString());
	}

	private PokemonRequestDTO createPokemonRequestDTO() {
		PokemonRequestDTO dto = new PokemonRequestDTO();
		dto.setPokemonNumber(1L);
		dto.setName("Bulbasaur");
		dto.setType1("Grass");
		dto.setType2("Poison");
		dto.setTotal(318);
		dto.setHp(45);
		dto.setAttack(49);
		dto.setDefense(49);
		dto.setSpAtk(65);
		dto.setSpDef(65);
		dto.setSpeed(45);
		dto.setGeneration(1);
		dto.setIsLegendary(false);

		return dto;
	}

	private PokemonResponseDTO createPokemonResponseDTO() {
		PokemonResponseDTO dto = new PokemonResponseDTO();
		dto.setId(1L);
		dto.setPokemonNumber(1L);
		dto.setName("Bulbasaur");
		dto.setType1("Grass");
		dto.setType2("Poison");
		dto.setTotal(318);
		dto.setHp(45);
		dto.setAttack(49);
		dto.setDefense(49);
		dto.setSpAtk(65);
		dto.setSpDef(65);
		dto.setSpeed(45);
		dto.setGeneration(1);
		dto.setIsLegendary(false);

		return dto;
	}

	private PokemonRequestDTO createLegendaryPokemonRequestDTO() {
		PokemonRequestDTO dto = new PokemonRequestDTO();
		dto.setPokemonNumber(144L);
		dto.setName("Articuno");
		dto.setType1("Ice");
		dto.setType2("Flying");
		dto.setTotal(580);
		dto.setHp(90);
		dto.setAttack(85);
		dto.setDefense(100);
		dto.setSpAtk(95);
		dto.setSpDef(125);
		dto.setSpeed(85);
		dto.setGeneration(1);
		dto.setIsLegendary(true);

		return dto;
	}

	private PokemonResponseDTO createLegendaryPokemonResponseDTO() {
		PokemonResponseDTO dto = new PokemonResponseDTO();
		dto.setId(2L);
		dto.setPokemonNumber(144L);
		dto.setName("Articuno");
		dto.setType1("Ice");
		dto.setType2("Flying");
		dto.setTotal(580);
		dto.setHp(90);
		dto.setAttack(85);
		dto.setDefense(100);
		dto.setSpAtk(95);
		dto.setSpDef(125);
		dto.setSpeed(85);
		dto.setGeneration(1);
		dto.setIsLegendary(true);

		return dto;
	}

	private PokemonRequestDTO requestLegendaryPokemon() {
		PokemonRequestDTO dto = new PokemonRequestDTO();
		dto.setIsLegendary(true);

		return dto;
	}

}
