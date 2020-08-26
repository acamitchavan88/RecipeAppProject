package com.prosping5.recipeBook;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.prospring5.recipeBook.model.Category;

// Unit Test Demo
public class CategoryTest
{
	Category category;
	
	@Before
	public void setUp()
	{
		category=new Category();
	}
		
	
	@Test
	public void getId() throws Exception
	{
		Long longIDValue=4L;
		
		category.setId(4L);
		
		assertEquals(longIDValue, category.getId());
		
		
	}
}