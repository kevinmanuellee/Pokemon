package com.project.pokemon.controller;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.project.pokemon.DTO.PokemonRequestDTO;
import com.project.pokemon.DTO.PokemonResponseDTO;
import com.project.pokemon.service.PokemonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("pokemon")
public class PokemonController {

    @Autowired
    private PokemonService service;

    @GetMapping
    public List<PokemonResponseDTO> getPokemons(PokemonRequestDTO dto) {
        return service.getPokemons(dto);
    }

    @PostMapping
    public PokemonResponseDTO createPokemon(@RequestBody PokemonRequestDTO dto) {
        return service.createPokemon(dto);
    }

    @PostMapping("/upload-csv-file")
    public List<PokemonResponseDTO> uploadCSVFile(@RequestParam("file") MultipartFile file) {

        List<PokemonRequestDTO> dtos = getPokemonRequestDTOS(file);
        return service.createPokemons(dtos);
    }

    private List<PokemonRequestDTO> getPokemonRequestDTOS(MultipartFile file) {
        List<PokemonRequestDTO> dtos = new ArrayList<>();
        try (Reader reader = new BufferedReader(new InputStreamReader(file.getInputStream()))) {
            CsvToBean<PokemonRequestDTO> csvToBean = new CsvToBeanBuilder(reader)
                    .withType(PokemonRequestDTO.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();
            dtos = csvToBean.parse();


        } catch (Exception e) {
            // TODO - use exception handler if have time
            e.printStackTrace();
        }
        return dtos;
    }

}
