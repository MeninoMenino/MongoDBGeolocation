package com.mm.mmtest.service;

import com.mm.mmtest.model.User;
import com.mm.mmtest.model.dto.InsertUserDto;

import java.util.List;

public interface UserService {

    public List<User> listUsers();

    public User findUser(String id);

    public User insertUser(InsertUserDto userDto);

    public List<User> findUserOver18();

}
