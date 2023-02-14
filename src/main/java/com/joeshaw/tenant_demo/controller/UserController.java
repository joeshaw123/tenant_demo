package com.joeshaw.tenant_demo.controller;

import com.joeshaw.tenant_demo.mapper.UserMapper;
import com.joeshaw.tenant_demo.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserMapper userMapper;

    @GetMapping("/list")
    public Object get(){
        List<SysUser> userList = userMapper.selectList(null);
        return userList;
    }
}
