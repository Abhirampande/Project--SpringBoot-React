package com.practice.project.Service;

import com.practice.project.Dto.UserDto;

public interface UserService {
    UserDto saveUser(UserDto userDto);

    UserDto getUserById(Long UserId);
}
