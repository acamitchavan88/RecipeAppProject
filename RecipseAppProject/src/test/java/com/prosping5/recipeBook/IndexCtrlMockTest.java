package com.prosping5.recipeBook;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.ui.Model;

import com.prosping5.recipeBook.controllers.IndexController;
import com.prospring5.recipeBook.services.RecipeService;

public class IndexCtrlMockTest {

	@Mock
	private RecipeService recipeService;
	@Mock
	private Model model;
	
	private IndexController indexController;
	@Before
	public void setUp() throws Exception
	{
		
		MockitoAnnotations.initMocks(this);
		indexController=new IndexController(recipeService);
		
	}

	@Test
	public String getIndexPage() throws Exception
	{
		return null;
		
	}
	
	
}
