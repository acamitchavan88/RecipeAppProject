package com.prospring5.recipeBook.services;

import java.util.Set;


import com.prospring5.recipeBook.model.Recipe;


public interface RecipeService {

	Set<Recipe> getRecipes();
}
