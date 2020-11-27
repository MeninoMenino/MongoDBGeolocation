package com.mm.mmtest.service.serviceimpl;

import com.mm.mmtest.model.User;
import com.mm.mmtest.model.dto.InsertUserDto;
import com.mm.mmtest.repository.UserRepository;
import com.mm.mmtest.service.UserService;
import com.mm.mmtest.service.util.UserUtilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;
    @Autowired
    UserUtilService userUtilService;

    @Override
    public List<User> listUsers() {
        return userRepository.findAll();
    }

    @Override
    public User findUser(String id) {
        return userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Usuário não existe"));
    }

    @Override
    public User insertUser(InsertUserDto userDto) {
        User user = userUtilService.convertDtoToEntity(userDto);
        return userRepository.save(user);
    }

    @Override
    public List<User> findUserOver18() {
        return userRepository.findUserOver18();
    }
}
