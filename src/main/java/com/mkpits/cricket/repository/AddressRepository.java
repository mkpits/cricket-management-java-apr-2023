package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
