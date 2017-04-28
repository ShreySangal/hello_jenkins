package com.sight.jenkins.service.impl;

import com.sight.jenkins.domain.User;
import com.sight.jenkins.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Someone 2017/4/27 15:27
 * @description
 * @date 2017/4/27 15:27.
 */
@Service
public class UserServiceImpl implements UserService{


    @Override
    public List<Object> getAllUser() {

        return null;
    }

    @Override
    public User getUserByID(Integer id) {
        return null;
    }
}
