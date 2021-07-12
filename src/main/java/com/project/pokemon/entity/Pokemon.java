package com.project.pokemon.entity;

import com.sun.istack.NotNull;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
@Data
public class Pokemon {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private Long pokemonNumber;
    @NotBlank
    private String name;
    @NotBlank
    private String type1;
    private String type2;
    @NotNull
    private Integer hp;
    @NotNull
    private Integer attack;
    @NotNull
    private Integer defense;
    @NotNull
    private Integer spAtk;
    @NotNull
    private Integer spDef;
    @NotNull
    private Integer speed;
    @NotNull
    private Integer total;
    @NotNull
    private Integer generation;
    @NotNull
    private Boolean isLegendary;
}
