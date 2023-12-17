package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.UserLogin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserLoginRepository extends JpaRepository<UserLogin,Integer> {
}
