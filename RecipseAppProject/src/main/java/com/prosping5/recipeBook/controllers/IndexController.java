package com.prosping5.recipeBook.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.prospring5.recipeBook.services.RecipeService;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j	
public class IndexController {

	private final RecipeService recipeService;

	public IndexController(RecipeService recipeService)
	{
		this.recipeService=recipeService;
		
	}
	 

	
	@RequestMapping({"","/","/index","/index.html"})
	public String displayRecipeMessge(Model model)
	{
		log.debug("In metho displayRecipeMessage:::");
		model.addAttribute("recipeList", recipeService.getRecipes());
		return "index";
	}
}
