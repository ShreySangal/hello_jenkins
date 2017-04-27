package com.sight.jenkins.controller;

import com.sight.jenkins.domain.User;
import com.sight.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Someone 2017/4/27 15:26
 * @description
 * @date 2017/4/27 15:26.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/list")
    public List<Object> getAllUser() {
        List<Object> objectList = userService.getAllUser();
        return objectList;
    }

    @PostMapping("info/{userId}")
    public User getUserById(@PathVariable(value = "userId") Integer userId){
        User user = userService.getUserByID(userId);
        return user;
    }

}
