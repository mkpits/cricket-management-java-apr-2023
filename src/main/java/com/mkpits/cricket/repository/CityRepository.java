package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.City;
import com.mkpits.cricket.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
    interface Userdao extends JpaRepository<UserEntity,Integer> {
    }
}
