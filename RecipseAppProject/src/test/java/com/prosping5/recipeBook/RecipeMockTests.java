package com.prosping5.recipeBook;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.prospring5.recipeBook.model.Recipe;
import com.prospring5.recipeBook.repositories.RecipeRepository;
import com.prospring5.recipeBook.services.RecipeServiceImpl;

public class RecipeMockTests {

	

	 private RecipeServiceImpl recipeServiceImpl;
	
	 @Mock
	 private RecipeRepository recipeRepository;
	 
	 @Before
	 public void setUp() throws Exception
	 {
		 MockitoAnnotations.initMocks(this);
		 recipeServiceImpl=new RecipeServiceImpl(recipeRepository);
	 }
	 
	 @Test
	 public void getRecipes() throws Exception
	 {       Recipe recipe = new Recipe();
     HashSet recipesData = new HashSet();
     recipesData.add(recipe);

     when(recipeRepository.findAll()).thenReturn(recipesData);

     Set<Recipe> recipes = recipeServiceImpl.getRecipes();

     assertEquals(recipes.size(), 1);
     verify(recipeRepository, times(1)).findAll();
		 
	 }
	 
}
