package com.arthas.webdemo.controller;

import com.arthas.webdemo.domain.User;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yuluo
 * @date: 2023/3/23 12:38
 * @description: some desc
 */

@RestController
@RequestMapping("/user")
public class UserController {

	@GetMapping("/get")
	public User getUser() {

		return User.builder()
				.username("arthas")
				.password("arthas")
				.eamil("arthas@ldxy.com")
				.build();
	}

}
