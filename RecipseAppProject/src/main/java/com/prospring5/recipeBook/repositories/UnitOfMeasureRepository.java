package com.prospring5.recipeBook.repositories;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.prospring5.recipeBook.model.UnitOfMeasure;

public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasureRepository, Long>
{
		Optional<UnitOfMeasure> findBydescription(String description);
}
