package com.lcwd.user.service.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.user.service.entities.User;

@Service
public interface UserService {

    //user operations

    //create
    User saveUser(User user);

    //get all user
    List<User> getAlluser();
    
    //get single user of given userId
    User getUser(String userId);

    //todo: delete
    //todo: update


}
