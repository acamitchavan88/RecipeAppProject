package com.prospring5.recipeBook.repositories;

import org.springframework.data.repository.CrudRepository;

import com.prospring5.recipeBook.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long>
{

}
