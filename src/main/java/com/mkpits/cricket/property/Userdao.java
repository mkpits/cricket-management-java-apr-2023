package com.mkpits.cricket.property;

import com.mkpits.cricket.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Userdao extends JpaRepository<UserEntity,Integer> {
}
