package com.prospring5.recipeBook.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prospring5.recipeBook.model.Category;

public interface CategoryRepository extends CrudRepository<Category, Long>
{
Optional<Category>  findByDescription(String description);

}
