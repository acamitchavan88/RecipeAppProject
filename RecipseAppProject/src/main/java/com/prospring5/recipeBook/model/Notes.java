package com.prospring5.recipeBook.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Notes {
@Lob
private String recipeNotes;
@OneToOne
private Recipe recpies;

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;







}
