package com.prospring5.recipeBook.model;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;


@Entity
@Data
public class Ingredient {
	
	public Ingredient()
	{
		
	}
	


	
private String description;
private BigDecimal amount;
@ManyToOne
private Recipe recipe;
@OneToOne(fetch=FetchType.EAGER)
private UnitOfMeasure unitOfMeasure;


public Ingredient(String description, BigDecimal amount, UnitOfMeasure unitOfMeasure, Recipe recipe) {
    this.description = description;
    this.amount = amount;
    this.unitOfMeasure = unitOfMeasure;
    this.recipe = recipe;
}

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;


}
