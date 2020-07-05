package com.ylx5.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ylx5.demo.dao.UserMapper;
import com.ylx5.demo.pojo.User;
import com.ylx5.demo.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public List<User> findAll(){
		return userMapper.findAll();
	}
	
}
