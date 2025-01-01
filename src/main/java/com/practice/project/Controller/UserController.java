package com.practice.project.Controller;

import com.practice.project.Dto.UserDto;
import com.practice.project.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;

    //building rest api
    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserDto userDto){
        UserDto savedUser = userService.saveUser(userDto);
        return new ResponseEntity<>(savedUser, HttpStatus.CREATED);
    }




}
