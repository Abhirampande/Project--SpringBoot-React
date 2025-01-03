package com.practice.project.Service;

import com.practice.project.Dto.UserDto;
import com.practice.project.Exception.ResourceNotFoundException;
import com.practice.project.Model.User;
import com.practice.project.Repo.UserRepo;
import com.practice.project.mapper.UserMapper;
import jakarta.persistence.Id;
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

    @Override
    public UserDto getUserById(Long userId) {
        User user = userRepo.findById(userId)
                .orElseThrow(()->
                        new ResourceNotFoundException("user not exists with id :" + userId
        ));
        return UserMapper.mapToUserDto(user);
    }
}
