package com.rajesh.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rajesh.api.entity.Country;
import com.rajesh.api.service.CountryService;

@RestController
@RequestMapping(path = "/api/v1/country")
public class CountryController {

	@Autowired
	private CountryService countryService;
	
	@GetMapping("/{countryId}")
	public Object getCountry(@PathVariable String countryId) {
		return countryService.getCountry(countryId);
	}
	
	@PostMapping
	public Object addCountry(@RequestBody Country country) {
		return countryService.addCountry(country);
	}
//	find country based on countryId then update existing data
	@PutMapping("/{countryId}")
	public Object updateCountry(@PathVariable(value="countryId") String countryId, @RequestBody Country country) {
		return countryService.updateCountry(countryId,country);
	}
	@DeleteMapping(path = "/{countryId}")
	public void deleteCountry(@PathVariable("countryId") String countryId) {
		 countryService.deleteCountry(countryId);
	}
	
}
