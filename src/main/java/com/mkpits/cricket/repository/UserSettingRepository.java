package com.mkpits.cricket.repository;

import com.mkpits.cricket.entity.UserSetting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSettingRepository extends JpaRepository<UserSetting,Integer> {
}
