package com.practice.project.Service;

import com.practice.project.Dto.UserDto;
import com.practice.project.Model.User;
import com.practice.project.Repo.UserRepo;
import com.practice.project.mapper.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;
    @Override
    public UserDto saveUser(UserDto userDto) {
        User user = UserMapper.mapToUser(userDto);
        User savedUser = userRepo.save(user);
        return UserMapper.mapToUserDto(savedUser);
    }
}
