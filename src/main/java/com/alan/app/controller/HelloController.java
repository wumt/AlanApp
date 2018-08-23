package com.alan.app.controller;

import java.util.List;

import java.util.Map;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController{

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @RequestMapping("hello")
    public List<Map<String, Object>> hello() {
        List<Map<String, Object>> list = jdbcTemplate.queryForList("SELECT user,password FROM mysql.user ", new Object[]{});
        return list;
    }
}