package com.sight.jenkins.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Enumeration;

/**
 * @author Aaron Yang (yb)
 * @version 1.0
 * @modified Someone 2017/4/27 16:43
 * @description
 * @date 2017/4/27 16:43.
 */
@RestController
public class WebHookController {

    @PostMapping("/webhook")
    public String responseWebHook( HttpServletRequest request, HttpServletResponse response){
//        String authType = request.getAuthType();
//        System.out.println("authType" + authType);
//
//        String contextPath = request.getContextPath();
//        System.out.println("contextPath" + contextPath!=null?contextPath:"");
//
//        Object headers = request.getAttribute("Headers");
//        System.out.println("headers" + headers!=null?headers.toString():"");
//
//        Object attribute = request.getAttribute("X-GitHub-Event");
//        System.out.println("attribute" + attribute!=null?attribute.toString():"");
//
//
//        Object head_commit = request.getAttribute("head_commit");
//        System.out.println("head_commit" + head_commit!=null?head_commit.toString():"");

        String[] payloads = request.getParameterValues("payload");
        for(int i = 0; i < payloads.length; i++){
            System.out.println(payloads[i]);
        }

        return payloads[0];
    }
}
