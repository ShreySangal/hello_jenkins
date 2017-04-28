package com.sight.jenkins.service;

import com.sight.jenkins.domain.User;

import java.util.List;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Someone 2017/4/27 15:26
 * @description
 * @date 2017/4/27 15:26.
 */
public interface UserService {

    List<Object> getAllUser();

    User getUserByID(Integer id);
}
