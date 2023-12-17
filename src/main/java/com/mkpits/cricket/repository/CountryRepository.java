package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country,Integer> {
}
