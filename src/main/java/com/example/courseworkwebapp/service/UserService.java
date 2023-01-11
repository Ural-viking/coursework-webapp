package com.example.courseworkwebapp.service;

import com.example.courseworkwebapp.dto.UserDto;
import com.example.courseworkwebapp.entity.User;
import java.util.List;

public interface UserService {
    void saveUser(UserDto userDto);
    User findUserByEmail(String email);
    List<UserDto> findAllUsers();
}
