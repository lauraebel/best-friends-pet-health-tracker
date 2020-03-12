package com.bestfriends.dao;

import java.util.List;

import com.bestfriends.model.Pet;

public interface PetDAO {
	
	public List<Pet> getAllPets();
	
	public void addNewPet(Pet newPet);

	public void deletePet(Pet petId);
	
	public void update(Pet pet);
	
	public void findPetById(Pet petId);
}
