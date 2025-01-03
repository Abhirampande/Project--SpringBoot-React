package com.practice.project.Service;

import com.practice.project.Dto.UserDto;

import java.util.List;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto getUserById(Long UserId);

    List<UserDto> getAllUsers();
}
