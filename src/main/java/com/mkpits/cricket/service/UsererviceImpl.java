//package com.mkpits.cricket.service;
//
//import com.mkpits.cricket.entity.UserEntity;
//import com.mkpits.cricket.repository.CityRepository;
//import jakarta.transaction.Transactional;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.Optional;
//
//@Service
//public class UsererviceImpl implements Userservice{
//
//    private CityRepository.Userdao userdao;
//    @Autowired
//    public UsererviceImpl(CityRepository.Userdao userdao) {
//        this.userdao = userdao;
//    }
//
//    @Override
//    @Transactional
//    public Optional<UserEntity> update(int empid) {
//        Optional <UserEntity>optional= userdao.findById(empid);
//
//        return optional;
//    }
//
//    @Override
//    public void deleted(int userid) {
//        userdao.deleteById(userid);
//    }
//
//}
