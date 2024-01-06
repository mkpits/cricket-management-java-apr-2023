package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.City;

import java.util.List;

public interface CityService {
    City insertCity(City city);
    List<City> findAllCity();
    City updateCityRecord(Integer cityId);
    void deleteCityRecord(Integer cityId);
}
