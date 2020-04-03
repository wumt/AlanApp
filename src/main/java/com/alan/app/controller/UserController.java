package com.alan.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;



import org.springframework.web.bind.annotation.RestController;

import com.alan.app.model.User;
import com.alan.app.service.UserService;

import java.util.List;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author wumt
 * @since 2018-08-15
 */
//@Controller
//@RequestMapping("/user")
@RestController
public class UserController {

    private static final Logger logger = LoggerFactory.getLogger(UserController.class);
	@Autowired
	private UserService userService;

	@RequestMapping("user")
	public List user() {
        logger.info("hello info");
        logger.error("hello error");
        logger.warn("hello warn");
        logger.trace("hello warn");

		List<User> users = userService.selectList(null);
		return users;
	}

	@RequestMapping("usernum")
	public int usernum() {
		int usernum = userService.selectCount(null);
		
		return usernum;
	}

	@RequestMapping("oneuser")
	public User oneuser() {
		User oneuser = userService.selectById(1);;
		return oneuser;
	}
}
