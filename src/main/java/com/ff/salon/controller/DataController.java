package com.ff.salon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ff.salon.repo.UserEntity;
import com.ff.salon.repo.UserRepo;

@RestController
public class DataController {
   @Autowired
   UserRepo userRepository;
    @GetMapping("/test")
    public List<UserEntity> getUsers(){
        return userRepository.findAll();
    } 

    @PostMapping("/addsubscriber")
    public void addSubscribers(@RequestBody UserEntity userdetails){
        userRepository.save(userdetails);
    }
}
