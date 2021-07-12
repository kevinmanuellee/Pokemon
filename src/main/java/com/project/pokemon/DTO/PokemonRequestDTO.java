package com.project.pokemon.DTO;

import com.opencsv.bean.CsvBindByName;
import lombok.Data;

@Data
public class PokemonRequestDTO {
    private Long id;
    @CsvBindByName(column = "#")
    private Long pokemonNumber;
    @CsvBindByName(column = "Name")
    private String name;
    @CsvBindByName(column = "Type 1")
    private String type1;
    @CsvBindByName(column = "Type 2")
    private String type2;
    @CsvBindByName(column = "HP")
    private Integer hp;
    @CsvBindByName(column = "Attack")
    private Integer attack;
    @CsvBindByName(column = "Defense")
    private Integer defense;
    @CsvBindByName(column = "Sp. Atk")
    private Integer spAtk;
    @CsvBindByName(column = "Sp. Def")
    private Integer spDef;
    @CsvBindByName(column = "Speed")
    private Integer speed;
    @CsvBindByName(column = "Total")
    private Integer total;
    @CsvBindByName(column = "Generation")
    private Integer generation;
    @CsvBindByName(column = "Legendary")
    private Boolean isLegendary;
}

