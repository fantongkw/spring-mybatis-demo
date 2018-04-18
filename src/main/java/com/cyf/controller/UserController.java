package com.cyf.controller;

import com.cyf.model.User;
import com.cyf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@org.springframework.stereotype.Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/hello")
    public String hello(){
        return "hello world";
    }

    @ResponseBody
    @RequestMapping(value = "/add", produces = {"application/json;charset=UTF-8"})
    public int addUser(User user){
        return userService.addUser(user);
    }

    @ResponseBody
    @RequestMapping(value = "/all/{pageNum}/{pageSize}", produces = {"application/json;charset=UTF-8"})
    public Object findAllUser(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){

        return userService.findAllUser(pageNum,pageSize);
    }
}
