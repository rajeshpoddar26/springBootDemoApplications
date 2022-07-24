package com.rajesh.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.rajesh.api.entity.Country;

public interface CountryRepository extends JpaRepository<Country, String>, JpaSpecificationExecutor<Country>{

}
