package com.practice.project.Service;

import com.practice.project.Dto.UserDto;
import com.practice.project.Exception.ResourceNotFoundException;
import com.practice.project.Model.User;
import com.practice.project.Repo.UserRepo;
import com.practice.project.mapper.UserMapper;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<UserDto> getAllUsers() {
        List<User> users = userRepo.findAll();
        return users.stream().map((user) -> UserMapper.mapToUserDto(user))
                .collect(Collectors.toList());
    }

    @Override
    public UserDto updateUser(Long userId, UserDto updatedUser) {
        User user = userRepo.findById(userId).orElseThrow(() -> new ResourceNotFoundException("user not exists:" + userId));
        user.setName(updatedUser.getName());
        user.setAge(updatedUser.getAge());
        User updatedUserObj = userRepo.save(user);
        //passing updated user object into dto as parameter
        return UserMapper.mapToUserDto(updatedUserObj);
    }

    @Override
    public void deleteUser(Long userId) {
        User user = userRepo.findById(userId).orElseThrow(() ->
                new ResourceNotFoundException("user not exists:" + userId));

        userRepo.deleteById(userId);
    }
}
