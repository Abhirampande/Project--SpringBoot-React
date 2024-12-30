package com.practice.project.mapper;

import com.practice.project.Dto.UserDto;
import com.practice.project.Model.User;

public class UserMapper {

    public static UserDto mapToUserDto(User user){
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getAge()
        );
    }
    public static User mapToUser(UserDto userDto){
        return new User(
                userDto.getId(),
                userDto.getName(),
                userDto.getAge()
        );
    }
}
