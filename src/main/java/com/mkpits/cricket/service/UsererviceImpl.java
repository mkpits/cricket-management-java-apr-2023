package com.mkpits.cricket.service;

import com.mkpits.cricket.property.Userdao;
import com.mkpits.cricket.entity.UserEntity;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsererviceImpl implements Userservice{

    private Userdao userdao;
    @Autowired
    public UsererviceImpl(Userdao userdao) {
        this.userdao = userdao;
    }

    @Override
    @Transactional
    public Optional<UserEntity> update(int empid) {
        Optional <UserEntity>optional= userdao.findById(empid);

        return optional;
    }

    @Override
    public void deleted(int userid) {
        userdao.deleteById(userid);
    }

}
