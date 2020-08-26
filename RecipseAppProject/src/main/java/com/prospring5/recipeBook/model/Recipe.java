package com.prospring5.recipeBook.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import lombok.Data;
@Entity
@Data
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;


private String	description;
private String source;
private String url;
private String directions;
private Integer	prepTime;
private Integer cookTime;
private Integer servings;
@OneToMany(cascade=CascadeType.ALL,mappedBy="recipe")
private Set<Ingredient> ingredients;

@ManyToMany
@JoinTable(name="recipe_category", joinColumns = @JoinColumn(name = "recipe_id"),
inverseJoinColumns = @JoinColumn(name = "category_id"))
private Set<Category> categories;


@OneToOne(cascade=CascadeType.ALL)
private Notes notes;

// To add Difficulty 
@Enumerated(value=EnumType.STRING)
private Difficulty difficulty;

// To add Recipe Image
@Lob
private Byte[] recipeImage;


}
