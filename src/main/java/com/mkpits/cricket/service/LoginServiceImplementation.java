package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.UserLogin;
import com.mkpits.cricket.repository.UserLoginRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImplementation implements LoginService{

    private UserLoginRepository userLoginRepository;

    @Autowired
    public LoginServiceImplementation(UserLoginRepository userLoginRepository) {
        this.userLoginRepository = userLoginRepository;
    }

    @Override
    public boolean loginCredential(String username, String password) {
        UserLogin userLogin = new UserLogin();
        if(username.equals(userLogin.getUsername()) && password.equals(userLogin.getPassword())){
            return true;
        }
        else {
            return false;
        }
    }

}
