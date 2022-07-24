package com.rajesh.api.service;

import com.rajesh.api.entity.Country;

public interface CountryService {

	Object getCountry(String countryId);

	Object addCountry(Country country);

	void deleteCountry(String countryId);

	Object updateCountry(String countryId, Country country);
	

}
