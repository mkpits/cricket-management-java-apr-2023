package com.mkpits.cricket.service;
import com.mkpits.cricket.entity.UserDetails;
import com.mkpits.cricket.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CricketServiceImplementation implements CricketService{
    private UserDetailsRepository userDetailsRepository;
    @Autowired
    public CricketServiceImplementation(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    @Override
    public UserDetails saveDetails(UserDetails userDetails) {
        return userDetailsRepository.save(userDetails);
    }

    @Override
    public List<UserDetails> findAllDetails() {
        return userDetailsRepository.findAll();
    }

    @Override
    public UserDetails updateRecord(Integer user_id) {
        UserDetails userDetails = userDetailsRepository.findById(user_id).get();
        return userDetails;
    }
}
