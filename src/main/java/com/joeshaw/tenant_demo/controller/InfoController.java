package com.joeshaw.tenant_demo.controller;


import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.conditions.segments.MergeSegments;
import com.joeshaw.tenant_demo.mapper.InfoMapper;
import com.joeshaw.tenant_demo.mapper.UserMapper;
import com.joeshaw.tenant_demo.model.Info;
import com.joeshaw.tenant_demo.model.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/info")
public class InfoController {
    @Autowired
    private InfoMapper infoMapper;
    @Autowired
    private UserMapper userMapper;
    @Value("${spring.datasource.url}")
    private String jdbcurl;

    @RequestMapping("/list")
    private Object getAll() {
        System.out.println(jdbcurl);
        List<Info> infoList = infoMapper.selectList(null);
//        System.out.println(infoList);
        return infoList;
    }

    @GetMapping("/get/{info}")
    private Object getByInfo(@PathVariable String info) {
        List<Info> infoList = infoMapper.getBy(info);
        return infoList;
    }

}
