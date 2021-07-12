package com.project.pokemon.DTO;

import lombok.Data;

@Data
public class PokemonResponseDTO {
    private Long id;
    private Long pokemonNumber;
    private String name;
    private String type1;
    private String type2;
    private Integer hp;
    private Integer attack;
    private Integer defense;
    private Integer spAtk;
    private Integer spDef;
    private Integer speed;
    private Integer total;
    private Integer generation;
    private Boolean isLegendary;
}