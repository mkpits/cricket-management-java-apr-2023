package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.City;
import com.mkpits.cricket.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImplementation implements CityService{
    private CityRepository cityRepository;
    @Autowired
    public CityServiceImplementation(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City insertCity(City city) {
        return cityRepository.save(city);
    }
}
