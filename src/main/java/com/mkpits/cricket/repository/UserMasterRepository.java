package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.UserMaster;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserMasterRepository extends JpaRepository<UserMaster,Integer> {
}
