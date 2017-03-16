package com.open.suns.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.open.suns.dao.UserDao;
import com.open.suns.entity.User;
import com.open.suns.service.UserService;

@Repository("UserService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserDao userDao;
	
	@Override
	public void register(User user) {
		// TODO Auto-generated method stub
		userDao.register(user);
	}

	@Override
	public User findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
