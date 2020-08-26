package com.prosping5.recipeBook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan({
	"com.prospring5.recipeBook.controllers.*","com.prospring5.recipeBook.model.*"
,"com.prospring5.recipeBook.bootstrap.*","com.prospring5.recipeBook.services.*",
"com.prospring5.recipeBook.repositories.*"})
public class RecipseProjectApplication  
{
	public static void main(String[] args)  
	{

	
		SpringApplication.run(RecipseProjectApplication.class, args);
		
		
	}

}
