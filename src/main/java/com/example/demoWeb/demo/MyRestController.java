package com.example.demoWeb.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class MyRestController {

    @Autowired
    private UserRepository userRepository;


    public MyRestController() {
    }

    @GetMapping("/{userId}")
    public String getUser(@PathVariable Long userId) {
        return this.userRepository.getUser(userId);
    }

}