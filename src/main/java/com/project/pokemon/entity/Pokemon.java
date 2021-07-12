package com.project.pokemon.entity;

import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Pokemon {
    // TODO - required validation
    @Id
    @GeneratedValue
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
