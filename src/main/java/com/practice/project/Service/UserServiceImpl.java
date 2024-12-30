package com.practice.project.Service;

import com.practice.project.Dto.UserDto;
import com.practice.project.Repo.UserRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService{

    private UserRepo userRepo;
    @Override
    public UserDto saveUser(UserDto userDto) {
        return null;
    }
}
