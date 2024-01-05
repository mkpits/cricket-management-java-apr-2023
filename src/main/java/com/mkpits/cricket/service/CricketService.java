package com.mkpits.cricket.service;

import com.mkpits.cricket.entity.UserDetails;


import java.util.List;

public interface CricketService {
    UserDetails saveDetails(UserDetails userDetails);
    List<UserDetails> findAllDetails();
    UserDetails updateRecord(Integer user_id);
    void deleteRecord(Integer user_id);
}
