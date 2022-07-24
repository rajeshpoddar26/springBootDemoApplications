package com.rajesh.api.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rajesh.api.entity.Country;
import com.rajesh.api.exception.CountryException;
import com.rajesh.api.repository.CountryRepository;
import com.rajesh.api.service.CountryService;

@Service
public class CountryServiceImpl implements CountryService {

	@Autowired
	private CountryRepository countryRepository;

	@Override
	public Object getCountry(String countryId) {

		countryRepository.findById(countryId);
		return countryRepository.findById(countryId);
	}

	@Override
	public Object addCountry(Country country) {
		return countryRepository.save(country);
	}

	@Override
	public void deleteCountry(String countryId) {
		Country country = countryRepository.findById(countryId).get();

		countryRepository.delete(country);
	}

	@Override
	public Object updateCountry(String countryId, Country country) {
		
		Object Objcountry = countryRepository.findById(countryId).get();
		if (Objcountry != null) {
			return countryRepository.save(country);
		} else {
			return new CountryException();
		}
	}

}
