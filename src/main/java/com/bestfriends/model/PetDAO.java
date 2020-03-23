package com.bestfriends.model;

import java.util.List;

public interface PetDAO {
	
	public List<Pet> getAllPets();
	
	public void addNewPet(Pet newPet);

	public void deletePet(Pet petId);
	
	public void update(Pet pet);
	
	public void findPetById(Pet petId);
}
