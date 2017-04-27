package com.sight.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Someone 2017/4/27 14:43
 * @description Hello Controller
 * @date 2017/4/27 14:43.
 */
@RestController
public class HelloController {

    @GetMapping(value = "/hello")
    public String index(){
        return "index";
    }
}
