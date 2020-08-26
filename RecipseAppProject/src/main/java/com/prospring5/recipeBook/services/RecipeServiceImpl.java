package com.prospring5.recipeBook.services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Service;

import com.prospring5.recipeBook.model.Recipe;
import com.prospring5.recipeBook.repositories.RecipeRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class RecipeServiceImpl implements RecipeService {

	private final RecipeRepository recipeRepository;
	
	public RecipeServiceImpl(RecipeRepository recipeRepository)
	{
		this.recipeRepository=recipeRepository;
		
	}
	
	@Override
	public Set<Recipe> getRecipes() {
		log.debug("In getRecipes method in services ");
		Set<Recipe> recipeSet=new HashSet<>();
		// Recipes Repositories to add all Repositories
		recipeRepository.findAll().iterator().forEachRemaining(recipeSet::add);
		
		return recipeSet;
	}

}
