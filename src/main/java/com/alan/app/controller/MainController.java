package com.alan.app.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alan.app.model.User;

@RestController
public class MainController {
	private final Map<String, Object> params = new HashMap<String, Object>();

	@GetMapping("/{city_id}/{user_id}")
	public Object findObject(@PathVariable("city_id") String city_id, @PathVariable("user_id") String user_id) {
		params.clear();
		params.put("city_id", city_id);
		params.put("user_id", user_id);
		return params;
	}

	@GetMapping(value = "/list_limit")
	public Object listLimit(@RequestParam(defaultValue = "0", name = "page") int page,
			@RequestParam(defaultValue = "10", name = "size") int size) {

		params.clear();
		params.put("page", page);
		params.put("size", size);
		return params;
	}

	@GetMapping("/save_user")
	public Object saveUser(User user) {
		params.clear();
		params.put("user", user);
		return params;
	}

	@GetMapping("/get_header")
	public Object getHeader(@RequestHeader("access_token") String accessToken, String id) {
		params.clear();
		params.put("access_token", accessToken);
		params.put("id", id);
		return params;
	}

	@PostMapping("/login")
	public Object login(String username, String password) {
		params.clear();
		params.put("username", username);
		params.put("password", password);
		return params;
	}

	    @PutMapping("/put")
	    public Object put(String id){
	        params.clear();
	        params.put("id", id);
	        return params;
	    }
	    
	    @DeleteMapping("/v1/del")
	    public Object del(String id){
	        params.clear();
	        params.put("id", id);
	        return params;
	    }   
	}