package com.model;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Crop {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String type;
    private LocalDate plantingDate;
    private LocalDate harvestDate;
    private String details;
	public Crop() {
		super();
	}
	public Crop(Long id, String name, String type, LocalDate plantingDate, LocalDate harvestDate, String details) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.plantingDate = plantingDate;
		this.harvestDate = harvestDate;
		this.details = details;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public LocalDate getPlantingDate() {
		return plantingDate;
	}
	public void setPlantingDate(LocalDate plantingDate) {
		this.plantingDate = plantingDate;
	}
	public LocalDate getHarvestDate() {
		return harvestDate;
	}
	public void setHarvestDate(LocalDate harvestDate) {
		this.harvestDate = harvestDate;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
    
    

}
