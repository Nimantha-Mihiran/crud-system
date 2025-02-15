package com.example.crud.system.controller;

import com.example.crud.system.dto.UserDTO;
import com.example.crud.system.entity.User;
import com.example.crud.system.service.UserService;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "api/v1/user")
@CrossOrigin

public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/getUsers")
    public List<UserDTO> getUser() {
        return userService.getAllUsers();
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "user Updated!";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser() {
        return "User Deleted!";
    }



}
