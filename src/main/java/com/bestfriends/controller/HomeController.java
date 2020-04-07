package com.bestfriends.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.bestfriends.beans.Registration;
import com.bestfriends.model.Pet;
import com.bestfriends.model.PetDAO;

@Controller
public class HomeController {
	
	@Autowired
	private PetDAO petDao;
	
	@RequestMapping("/")
	public String displayHomePage(HttpServletRequest request) {
		return "homePage";
	}

	@RequestMapping(path="/createAccount", method=RequestMethod.GET)
	public String displayCreateAccountPage(ModelMap map) {
		if(!map.containsAttribute("registration")) {
			map.addAttribute("registration", new Registration());
		}
		return "createAccount";
	}
	
	@RequestMapping(path="/createAccount", method=RequestMethod.POST)
	public String addNewAccount(@Valid @ModelAttribute("registration") Registration newRegistration, BindingResult result) {

		if(result.hasErrors()) {
			return "createAccount";
		}
		return "redirect:/success";
	}
	
	@RequestMapping(path="/success", method=RequestMethod.GET)
	public String showNewAccountConfirmation(ModelMap map) {
		return "success";
	}

	@RequestMapping(path="/addPet", method=RequestMethod.GET)
	public String addPetForm() {
		return "addPet";
	}
	
	@RequestMapping(path="/petInput", method=RequestMethod.POST)
	public String addPet(@RequestParam String petName, @RequestParam String petType, @RequestParam String petBreed, @RequestParam int petAge,
			@RequestParam Date petDateOfBirth, @RequestParam String petGender, @RequestParam String petFixed) {
	
		Pet newPet = new Pet();
		newPet.setPetName(petName);
		newPet.setPetType(petType);
		newPet.setPetBreed(petBreed);
		newPet.setPetGender(petGender);
		newPet.setPetFixed(petFixed);
		newPet.setPetAge(petAge);
		newPet.setPetDateOfBirth(petDateOfBirth);
		
		petDao.addNewPet(newPet);
				
		return "success";
	}
}
