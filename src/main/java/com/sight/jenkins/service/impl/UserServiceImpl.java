package com.sight.jenkins.service.impl;

import com.sight.jenkins.dao.UserDao;
import com.sight.jenkins.domain.User;
import com.sight.jenkins.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private UserDao userDao;

    @Override
    public List<Object> getAllUser() {
        System.out.println("sadadasda");
        return null;
    }

    @Override
    public User getUserByID(Integer id) {
        System.out.println("1231313123");

        return null;
    }

    @Override
    public boolean userLogin(String username, String password) {
        Integer count = userDao.checkUserLogin(username, password);
        if(count > 0){
            return true;
        }
        return false;
    }
}
