package com.bestfriends.model;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Component;

@Component
public class JDBCPetDAO implements PetDAO {
	
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	public JDBCPetDAO(DataSource dataSource) {
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public List<Pet> getAllPets() {
		List<Pet> allPets = new ArrayList<>();
		String sqlSelectAllPets = "SELECT pet_id, pet_name, pet_type, pet_breed, pet_age, pet_gender, pet_fixed FROM pet";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectAllPets);
		while(results.next()) {
			Pet pet = new Pet();
			pet.setPetId(results.getInt("pet_id"));
			pet.setPetName(results.getString("pet_name"));
			pet.setPetType(results.getString("pet_type"));
			pet.setPetBreed(results.getString("pet_breed"));
			pet.setPetAge(results.getInt("pet_age"));
			pet.setPetGender(results.getString("pet_gender"));
			pet.setPetFixed(results.getString("pet_fixed"));
			
			allPets.add(pet);
		}
		return allPets;
	}
	
	@Override
	public void findPetById(Pet petId) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void addNewPet(Pet newPet) {
		Integer petId = getNextPetId();
		String sqlInsertPet = "INSERT INTO pet(pet_id, pet_name, pet_type, pet_breed, pet_age, pet_date_of_birth, pet_gender, pet_fixed, owner_id, veterinarian_id) VALUES (?,?,?,?,?,?,?,?,?,?)";
		jdbcTemplate.update(sqlInsertPet, petId, newPet.getPetName(), newPet.getPetType(), newPet.getPetBreed(), newPet.getPetAge(), newPet.getPetDateOfBirth(), newPet.getPetGender(), newPet.getPetFixed(), newPet.getOwnerId(), newPet.getVeterinarianId());
		newPet.setPetId(petId);
	}

	@Override
	public void update(Pet updatedPet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deletePet(Pet petId) {
		// TODO Auto-generated method stub
		
	}

	private Integer getNextPetId() {
		String sqlSelectNextId = "SELECT NEXTVAL('pet_pet_id_seq')";
		SqlRowSet results = jdbcTemplate.queryForRowSet(sqlSelectNextId);
		Integer petId = null;
		if(results.next()) {
			petId = results.getInt(1);
		} else {
			throw new RuntimeException("Unable to Get Next Pet Id");
		}
		return petId;
	}


}
