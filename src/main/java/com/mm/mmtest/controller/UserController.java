package com.mm.mmtest.controller;

import com.mm.mmtest.model.User;
import com.mm.mmtest.model.dto.InsertUserDto;
import com.mm.mmtest.service.serviceimpl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserServiceImpl userServiceImpl;

    @GetMapping
    public List<User> listUsers(){
        return userServiceImpl.listUsers();
    }

    @GetMapping("/{id}")
    public User findUser(@PathVariable String id){
        return userServiceImpl.findUser(id);
    }

    @PostMapping
    public User insertUser(@RequestBody InsertUserDto user){
        return userServiceImpl.insertUser(user);
    }

    @GetMapping("/major")
    public List<User> findUserOver18(){
        return userServiceImpl.findUserOver18();
    }
}
